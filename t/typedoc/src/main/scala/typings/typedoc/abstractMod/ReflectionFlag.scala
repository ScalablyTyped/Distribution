package typings.typedoc.abstractMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReflectionFlag extends js.Object

@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlag")
@js.native
object ReflectionFlag extends js.Object {
  @js.native
  sealed trait Abstract extends ReflectionFlag
  
  @js.native
  sealed trait Const extends ReflectionFlag
  
  @js.native
  sealed trait ConstructorProperty extends ReflectionFlag
  
  @js.native
  sealed trait DefaultValue extends ReflectionFlag
  
  @js.native
  sealed trait ExportAssignment extends ReflectionFlag
  
  @js.native
  sealed trait Exported extends ReflectionFlag
  
  @js.native
  sealed trait External extends ReflectionFlag
  
  @js.native
  sealed trait Let extends ReflectionFlag
  
  @js.native
  sealed trait None extends ReflectionFlag
  
  @js.native
  sealed trait Optional extends ReflectionFlag
  
  @js.native
  sealed trait Private extends ReflectionFlag
  
  @js.native
  sealed trait Protected extends ReflectionFlag
  
  @js.native
  sealed trait Public extends ReflectionFlag
  
  @js.native
  sealed trait Readonly extends ReflectionFlag
  
  @js.native
  sealed trait Rest extends ReflectionFlag
  
  @js.native
  sealed trait Static extends ReflectionFlag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionFlag with Double] = js.native
  /* 2048 */ @js.native
  object Abstract extends TopLevel[Abstract with Double]
  
  /* 4096 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  /* 1024 */ @js.native
  object ConstructorProperty extends TopLevel[ConstructorProperty with Double]
  
  /* 256 */ @js.native
  object DefaultValue extends TopLevel[DefaultValue with Double]
  
  /* 32 */ @js.native
  object ExportAssignment extends TopLevel[ExportAssignment with Double]
  
  /* 16 */ @js.native
  object Exported extends TopLevel[Exported with Double]
  
  /* 64 */ @js.native
  object External extends TopLevel[External with Double]
  
  /* 8192 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 128 */ @js.native
  object Optional extends TopLevel[Optional with Double]
  
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 2 */ @js.native
  object Protected extends TopLevel[Protected with Double]
  
  /* 4 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /* 16384 */ @js.native
  object Readonly extends TopLevel[Readonly with Double]
  
  /* 512 */ @js.native
  object Rest extends TopLevel[Rest with Double]
  
  /* 8 */ @js.native
  object Static extends TopLevel[Static with Double]
  
}

