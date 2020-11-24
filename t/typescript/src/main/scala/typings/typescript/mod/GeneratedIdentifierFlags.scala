package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeneratedIdentifierFlags extends js.Object
@JSImport("typescript", "GeneratedIdentifierFlags")
@js.native
object GeneratedIdentifierFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeneratedIdentifierFlags with Double] = js.native
  
  @js.native
  sealed trait AllowNameSubstitution extends GeneratedIdentifierFlags
  /* 64 */ @js.native
  object AllowNameSubstitution extends TopLevel[AllowNameSubstitution with Double]
  
  @js.native
  sealed trait FileLevel extends GeneratedIdentifierFlags
  /* 32 */ @js.native
  object FileLevel extends TopLevel[FileLevel with Double]
  
  @js.native
  sealed trait None extends GeneratedIdentifierFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Optimistic extends GeneratedIdentifierFlags
  /* 16 */ @js.native
  object Optimistic extends TopLevel[Optimistic with Double]
  
  @js.native
  sealed trait ReservedInNestedScopes extends GeneratedIdentifierFlags
  /* 8 */ @js.native
  object ReservedInNestedScopes extends TopLevel[ReservedInNestedScopes with Double]
}
