package typings.typedoc.abstractMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReflectionFlag extends js.Object
@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlag")
@js.native
object ReflectionFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionFlag with Double] = js.native
  
  @js.native
  sealed trait Abstract extends ReflectionFlag
  /* 2048 */ @js.native
  object Abstract extends TopLevel[Abstract with Double]
  
  @js.native
  sealed trait Const extends ReflectionFlag
  /* 4096 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  @js.native
  sealed trait ConstructorProperty extends ReflectionFlag
  /* 1024 */ @js.native
  object ConstructorProperty extends TopLevel[ConstructorProperty with Double]
  
  @js.native
  sealed trait DefaultValue extends ReflectionFlag
  /* 256 */ @js.native
  object DefaultValue extends TopLevel[DefaultValue with Double]
  
  @js.native
  sealed trait ExportAssignment extends ReflectionFlag
  /* 32 */ @js.native
  object ExportAssignment extends TopLevel[ExportAssignment with Double]
  
  @js.native
  sealed trait Exported extends ReflectionFlag
  /* 16 */ @js.native
  object Exported extends TopLevel[Exported with Double]
  
  @js.native
  sealed trait External extends ReflectionFlag
  /* 64 */ @js.native
  object External extends TopLevel[External with Double]
  
  @js.native
  sealed trait Let extends ReflectionFlag
  /* 8192 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  @js.native
  sealed trait None extends ReflectionFlag
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Optional extends ReflectionFlag
  /* 128 */ @js.native
  object Optional extends TopLevel[Optional with Double]
  
  @js.native
  sealed trait Private extends ReflectionFlag
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Protected extends ReflectionFlag
  /* 2 */ @js.native
  object Protected extends TopLevel[Protected with Double]
  
  @js.native
  sealed trait Public extends ReflectionFlag
  /* 4 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  @js.native
  sealed trait Readonly extends ReflectionFlag
  /* 16384 */ @js.native
  object Readonly extends TopLevel[Readonly with Double]
  
  @js.native
  sealed trait Rest extends ReflectionFlag
  /* 512 */ @js.native
  object Rest extends TopLevel[Rest with Double]
  
  @js.native
  sealed trait Static extends ReflectionFlag
  /* 8 */ @js.native
  object Static extends TopLevel[Static with Double]
}
