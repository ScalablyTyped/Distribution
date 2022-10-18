package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.yjs.distSrcTypesYmapMod.YMap
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmlhookMod {
  
  @JSImport("yjs/dist/src/types/YXmlHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YXmlHook", "YXmlHook")
  @js.native
  open class YXmlHook protected () extends YMap[Any] {
    /**
      * @param {string} hookName nodeName of the Dom Node.
      */
    def this(hookName: String) = this()
    
    /**
      * @type {string}
      */
    var hookName: String = js.native
    
    /**
      * Creates a Dom Element that mirrors this YXmlElement.
      *
      * @param {Document} [_document=document] The document object (you must define
      *                                        this when calling this method in
      *                                        nodejs)
      * @param {Object.<string, any>} [hooks] Optional property to customize how hooks
      *                                             are presented in the DOM
      * @param {any} [binding] You should not set this property. This is
      *                               used if DomBinding wants to create a
      *                               association to the created DOM type
      * @return {Element} The {@link https://developer.mozilla.org/en-US/docs/Web/API/Element|Dom Element}
      *
      * @public
      */
    def toDOM(): Element = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any]): Element = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any], binding: Any): Element = js.native
    def toDOM(_document: Unit, hooks: Unit, binding: Any): Element = js.native
    def toDOM(_document: Document): Element = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any]): Element = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any], binding: Any): Element = js.native
    def toDOM(_document: Document, hooks: Unit, binding: Any): Element = js.native
  }
  
  inline def readYXmlHook(decoder: UpdateDecoderV1): YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlHook]
  inline def readYXmlHook(decoder: UpdateDecoderV2): YXmlHook = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlHook")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlHook]
}
