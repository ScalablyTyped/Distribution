package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment
import typings.yjs.distSrcTypesYxmltextMod.YXmlText
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
  open class YXmlElement[KV /* <: StringDictionary[ValueTypes] */] () extends YXmlFragment {
    def this(nodeName: String) = this()
    
    /**
      * @type {Map<string, any>|null}
      */
    var _prelimAttrs: (Map[String, Any]) | Null = js.native
    
    /**
      * Returns an attribute value that belongs to the attribute name.
      *
      * @template {keyof KV & string} KEY
      *
      * @param {KEY} attributeName The attribute name that identifies the
      *                               queried value.
      * @return {KV[KEY]|undefined} The queried attribute value.
      *
      * @public
      */
    def getAttribute[KEY_1 /* <: /* keyof KV */ String */](attributeName: KEY_1): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: KV[KEY_1] */ js.Any
      ] = js.native
    
    /**
      * Returns all attribute name/value pairs in a JSON Object.
      *
      * @return {{ [Key in Extract<keyof KV,string>]?: KV[Key]}} A JSON Object that describes the attributes.
      *
      * @public
      */
    def getAttributes(): /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in std.Extract<keyof KV, string> ]:? KV[Key] | undefined} */ js.Any = js.native
    
    /**
      * Returns whether an attribute exists
      *
      * @param {string} attributeName The attribute name to check for existence.
      * @return {boolean} whether the attribute exists.
      *
      * @public
      */
    def hasAttribute(attributeName: String): Boolean = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def nextSibling: YXmlElement[StringDictionary[String]] | YXmlText | Null = js.native
    
    var nodeName: String = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def prevSibling: YXmlElement[StringDictionary[String]] | YXmlText | Null = js.native
    
    /**
      * Removes an attribute from this YXmlElement.
      *
      * @param {string} attributeName The attribute name that is to be removed.
      *
      * @public
      */
    def removeAttribute(attributeName: String): Unit = js.native
    
    /**
      * Sets or updates an attribute.
      *
      * @template {keyof KV & string} KEY
      *
      * @param {KEY} attributeName The attribute name that is to be set.
      * @param {KV[KEY]} attributeValue The attribute value that is to be set.
      *
      * @public
      */
    def setAttribute[KEY /* <: /* keyof KV */ String */](
      attributeName: KEY,
      attributeValue: /* import warning: importer.ImportType#apply Failed type conversion: KV[KEY] */ js.Any
    ): Unit = js.native
  }
  
  inline def readYXmlElement(decoder: UpdateDecoderV1): YXmlElement[StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlElement[StringDictionary[String]]]
  inline def readYXmlElement(decoder: UpdateDecoderV2): YXmlElement[StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlElement")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlElement[StringDictionary[String]]]
  
  type ValueTypes = js.Object | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
}
