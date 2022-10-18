package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment
import typings.yjs.distSrcTypesYxmltextMod.YXmlText
import typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmlelementMod {
  
  @JSImport("yjs/dist/src/types/YXmlElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YXmlElement", "YXmlElement")
  @js.native
  open class YXmlElement () extends YXmlFragment {
    def this(nodeName: String) = this()
    
    /**
      * @type {Map<string, any>|null}
      */
    var _prelimAttrs: (Map[String, Any]) | Null = js.native
    
    /**
      * Returns an attribute value that belongs to the attribute name.
      *
      * @param {String} attributeName The attribute name that identifies the
      *                               queried value.
      * @return {String} The queried attribute value.
      *
      * @public
      */
    def getAttribute(attributeName: String): String = js.native
    
    /**
      * Returns all attribute name/value pairs in a JSON Object.
      *
      * @param {Snapshot} [snapshot]
      * @return {Object<string, any>} A JSON Object that describes the attributes.
      *
      * @public
      */
    def getAttributes(): StringDictionary[Any] = js.native
    def getAttributes(snapshot: Snapshot_): StringDictionary[Any] = js.native
    
    /**
      * Returns whether an attribute exists
      *
      * @param {String} attributeName The attribute name to check for existence.
      * @return {boolean} whether the attribute exists.
      *
      * @public
      */
    def hasAttribute(attributeName: String): Boolean = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def nextSibling: YXmlElement | YXmlText | Null = js.native
    
    var nodeName: String = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def prevSibling: YXmlElement | YXmlText | Null = js.native
    
    /**
      * Removes an attribute from this YXmlElement.
      *
      * @param {String} attributeName The attribute name that is to be removed.
      *
      * @public
      */
    def removeAttribute(attributeName: String): Unit = js.native
    
    /**
      * Sets or updates an attribute.
      *
      * @param {String} attributeName The attribute name that is to be set.
      * @param {String} attributeValue The attribute value that is to be set.
      *
      * @public
      */
    def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
  }
  
  inline def readYXmlElement(decoder: UpdateDecoderV1): YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlElement]
  inline def readYXmlElement(decoder: UpdateDecoderV2): YXmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlElement]
}
