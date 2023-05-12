package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Text
import typings.yjs.distSrcTypesYtextMod.YText
import typings.yjs.distSrcTypesYxmlelementMod.YXmlElement
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmltextMod {
  
  @JSImport("yjs/dist/src/types/YXmlText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YXmlText", "YXmlText")
  @js.native
  /**
    * @param {String} [string] The initial value of the YText.
    */
  open class YXmlText () extends YText {
    def this(string: String) = this()
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def nextSibling: YXmlElement[StringDictionary[String]] | YXmlText | Null = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def prevSibling: YXmlElement[StringDictionary[String]] | YXmlText | Null = js.native
    
    /**
      * Creates a Dom Element that mirrors this YXmlText.
      *
      * @param {Document} [_document=document] The document object (you must define
      *                                        this when calling this method in
      *                                        nodejs)
      * @param {Object<string, any>} [hooks] Optional property to customize how hooks
      *                                             are presented in the DOM
      * @param {any} [binding] You should not set this property. This is
      *                               used if DomBinding wants to create a
      *                               association to the created DOM type.
      * @return {Text} The {@link https://developer.mozilla.org/en-US/docs/Web/API/Element|Dom Element}
      *
      * @public
      */
    def toDOM(): Text = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any]): Text = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any], binding: Any): Text = js.native
    def toDOM(_document: Unit, hooks: Unit, binding: Any): Text = js.native
    def toDOM(_document: Document): Text = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any]): Text = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any], binding: Any): Text = js.native
    def toDOM(_document: Document, hooks: Unit, binding: Any): Text = js.native
  }
  
  inline def readYXmlText(decoder: UpdateDecoderV1): YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlText]
  inline def readYXmlText(decoder: UpdateDecoderV2): YXmlText = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlText")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlText]
}
