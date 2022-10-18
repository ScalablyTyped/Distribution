package typings.typedoc.anon

import typings.typedoc.distLibUtilsOptionsDeclarationMod.KeyToDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/utils/options.Options, 'addDeclaration'> */
trait PickOptionsaddDeclaration extends StObject {
  
  def addDeclaration[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any */](declaration: NameK[K] & KeyToDeclaration[K]): Unit
  @JSName("addDeclaration")
  var addDeclaration_Original: js.Function1[
    /* declaration */ (NameK[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
    ]) & (KeyToDeclaration[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
    ]), 
    Unit
  ]
}
object PickOptionsaddDeclaration {
  
  inline def apply(
    addDeclaration: /* declaration */ (NameK[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
    ]) & (KeyToDeclaration[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
    ]) => Unit
  ): PickOptionsaddDeclaration = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction1(addDeclaration))
    __obj.asInstanceOf[PickOptionsaddDeclaration]
  }
  
  extension [Self <: PickOptionsaddDeclaration](x: Self) {
    
    inline def setAddDeclaration(
      value: /* declaration */ (NameK[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
        ]) & (KeyToDeclaration[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any
        ]) => Unit
    ): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction1(value))
  }
}
