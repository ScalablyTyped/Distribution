package typings.vueDocgenApi

import typings.babelTypes.mod.ArrowFunctionExpression_
import typings.babelTypes.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseValidatorMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/utils/parseValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(validatorNode: ArrowFunctionExpression_): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(validatorNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
  @scala.inline
  def default(validatorNode: Method): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(validatorNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
}
