package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.yjs.distSrcTypesYxmlelementMod.YXmlElement
import typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment
import typings.yjs.distSrcTypesYxmltextMod.YXmlText
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmleventMod {
  
  @JSImport("yjs/dist/src/types/YXmlEvent", "YXmlEvent")
  @js.native
  open class YXmlEvent protected () extends YEvent[YXmlFragment | YXmlElement[StringDictionary[String]] | YXmlText] {
    /**
      * @param {YXmlElement|YXmlText|YXmlFragment} target The target on which the event is created.
      * @param {Set<string|null>} subs The set of changed attributes. `null` is included if the
      *                   child list changed.
      * @param {Transaction} transaction The transaction instance with wich the
      *                                  change was created.
      */
    def this(target: YXmlElement[StringDictionary[String]], subs: Set[String | Null], transaction: Transaction) = this()
    def this(target: YXmlFragment, subs: Set[String | Null], transaction: Transaction) = this()
    def this(target: YXmlText, subs: Set[String | Null], transaction: Transaction) = this()
    
    /**
      * Set of all changed attributes.
      * @type {Set<string>}
      */
    var attributesChanged: Set[String] = js.native
    
    /**
      * Whether the children changed.
      * @type {Boolean}
      * @private
      */
    /* private */ var childListChanged: Any = js.native
  }
}
