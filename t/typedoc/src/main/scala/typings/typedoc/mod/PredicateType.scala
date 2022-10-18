package typings.typedoc.mod

import typings.typedoc.distLibModelsTypesMod.SomeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "PredicateType")
@js.native
open class PredicateType protected ()
  extends typings.typedoc.distLibModelsMod.PredicateType {
  /**
    * Create a new PredicateType instance.
    *
    * @param name The identifier name which is tested by the predicate.
    * @param asserts True if the type is of the form `asserts val is string`,
    *                false if the type is of the form `val is string`
    * @param targetType The type that the identifier is tested to be.
    *                   May be undefined if the type is of the form `asserts val`.
    *                   Will be defined if the type is of the form `asserts val is string` or `val is string`.
    */
  def this(name: String, asserts: Boolean) = this()
  def this(name: String, asserts: Boolean, targetType: SomeType) = this()
}
