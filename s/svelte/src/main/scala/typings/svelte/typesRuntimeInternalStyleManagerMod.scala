package typings.svelte

import typings.std.Element
import typings.std.ElementCSSInlineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalStyleManagerMod {
  
  @JSImport("svelte/types/runtime/internal/style_manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearRules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear_rules")().asInstanceOf[Unit]
  
  inline def createRule(
    node: Element & ElementCSSInlineStyle,
    a: Double,
    b: Double,
    duration: Double,
    delay: Double,
    ease: js.Function1[/* t */ Double, Double],
    fn: js.Function2[/* t */ Double, /* u */ Double, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("create_rule")(node.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createRule(
    node: Element & ElementCSSInlineStyle,
    a: Double,
    b: Double,
    duration: Double,
    delay: Double,
    ease: js.Function1[/* t */ Double, Double],
    fn: js.Function2[/* t */ Double, /* u */ Double, String],
    uid: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("create_rule")(node.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], ease.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], uid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def deleteRule(node: Element & ElementCSSInlineStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete_rule")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def deleteRule(node: Element & ElementCSSInlineStyle, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delete_rule")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
