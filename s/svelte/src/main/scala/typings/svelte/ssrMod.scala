package typings.svelte

import typings.svelte.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssrMod {
  
  @JSImport("svelte/types/runtime/internal/ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAttribute(name: Any, value: Any, boolean: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add_attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], boolean.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def addClasses(classes: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("add_classes")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def addStyles(style_object: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("add_styles")(style_object.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createSsrComponent(fn: Any): Render = ^.asInstanceOf[js.Dynamic].applyDynamic("create_ssr_component")(fn.asInstanceOf[js.Any]).asInstanceOf[Render]
  
  inline def debug(file: Any, line: Any, column: Any, values: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(file.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def each(items: Any, fn: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(items.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(value: Any, is_attr: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], is_attr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escapeAttributeValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escape_attribute_value")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def escapeObject(obj: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("escape_object")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("svelte/types/runtime/internal/ssr", "invalid_attribute_name_character")
  @js.native
  val invalidAttributeNameCharacter: js.RegExp = js.native
  
  inline def isVoid(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_void")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeSsrStyles(style_attribute: Any, style_directive: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge_ssr_styles")(style_attribute.asInstanceOf[js.Any], style_directive.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  object missingComponent {
    
    @JSImport("svelte/types/runtime/internal/ssr", "missing_component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def render(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("$$render")().asInstanceOf[String]
  }
  
  inline def spread(args: Any, attrs_to_add: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("spread")(args.asInstanceOf[js.Any], attrs_to_add.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateComponent(component: Any, name: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validate_component")(component.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
}
