package typings.xmlUtils

import typings.xmlUtils.anon.Debug
import typings.xmlUtils.anon.Nested
import typings.xmlUtils.anon.ReturnOnFirst
import typings.xmlUtils.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findTagByName(xml: String, tagName: String): js.UndefOr[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tag]]
  inline def findTagByName(xml: String, tagName: String, options: Debug): js.UndefOr[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tag]]
  
  inline def findTagByPath(xml: String, path: js.Array[String]): js.UndefOr[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagByPath")(xml.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tag]]
  inline def findTagByPath(xml: String, path: js.Array[String], options: `0`): js.UndefOr[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagByPath")(xml.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tag]]
  
  inline def findTagsByName(xml: String, tagName: String): js.Array[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagsByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tag]]
  inline def findTagsByName(xml: String, tagName: String, options: Nested): js.Array[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagsByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tag]]
  
  inline def findTagsByPath(xml: String, path: js.Array[String]): js.Array[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagsByPath")(xml.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tag]]
  inline def findTagsByPath(xml: String, path: js.Array[String], options: ReturnOnFirst): js.Array[Tag] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTagsByPath")(xml.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tag]]
  
  inline def getAttribute(tag: String, attributeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(tag.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getAttribute(tag: String, attributeName: String, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(tag.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getAttribute(tag: Tag, attributeName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(tag.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getAttribute(tag: Tag, attributeName: String, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(tag.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeTagsByName(xml: String, tagName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTagsByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def removeTagsByName(xml: String, tagName: String, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTagsByName")(xml.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Tag extends StObject {
    
    var inner: Null | String
    
    var outer: String
  }
  object Tag {
    
    inline def apply(outer: String): Tag = {
      val __obj = js.Dynamic.literal(outer = outer.asInstanceOf[js.Any], inner = null)
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setInner(value: String): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerNull: Self = StObject.set(x, "inner", null)
      
      inline def setOuter(value: String): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    }
  }
}
