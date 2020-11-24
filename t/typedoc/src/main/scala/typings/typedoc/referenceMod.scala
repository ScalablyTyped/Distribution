package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.ReferenceReflection
import typings.typedoc.modelsMod.ReferenceType
import typings.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/factories/reference", JSImport.Namespace)
@js.native
object referenceMod extends js.Object {
  
  def createReferenceReflection(context: Context, source: Symbol, target: Symbol): js.UndefOr[ReferenceReflection] = js.native
  
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
}
