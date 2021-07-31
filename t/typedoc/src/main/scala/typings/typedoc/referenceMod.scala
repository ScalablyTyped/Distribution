package typings.typedoc

import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.ReferenceReflection
import typings.typedoc.modelsMod.ReferenceType
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createReferenceReflection(context: Context, source: Symbol, target: Symbol): js.UndefOr[ReferenceReflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceReflection")(context.asInstanceOf[js.Any], source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceReflection]]
  
  @scala.inline
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReferenceType]]
  @scala.inline
  def createReferenceType(context: Context, symbol: Unit, includeParent: Boolean): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], includeParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
  @scala.inline
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
  @scala.inline
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReferenceType")(context.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], includeParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReferenceType]]
}
