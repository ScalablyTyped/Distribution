package typings.webpack.anon

import typings.schemaUtils.validateMod.Schema
import typings.schemaUtils.validateMod.ValidationErrorConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(schema: Schema, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: Schema, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: Schema, options: js.Object): Unit = js.native
  def apply(schema: Schema, options: js.Object, configuration: ValidationErrorConfiguration): Unit = js.native
}
