package typings.wordpressCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseInstanceIdMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`object`: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(`object`: js.Object, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default[T /* <: String | Double */](`object`: js.Object, prefix: String, preferredId: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], preferredId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def default_T_T[T /* <: String | Double */](`object`: js.Object, prefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[T]
}
