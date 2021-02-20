package typings.typedoc.abstractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReflectionFlag extends StObject
@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlag")
@js.native
object ReflectionFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionFlag with Double] = js.native
  
  @js.native
  sealed trait Abstract extends ReflectionFlag
  /* 2048 */ val Abstract: typings.typedoc.abstractMod.ReflectionFlag.Abstract with Double = js.native
  
  @js.native
  sealed trait Const extends ReflectionFlag
  /* 4096 */ val Const: typings.typedoc.abstractMod.ReflectionFlag.Const with Double = js.native
  
  @js.native
  sealed trait ConstructorProperty extends ReflectionFlag
  /* 1024 */ val ConstructorProperty: typings.typedoc.abstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
  
  @js.native
  sealed trait DefaultValue extends ReflectionFlag
  /* 256 */ val DefaultValue: typings.typedoc.abstractMod.ReflectionFlag.DefaultValue with Double = js.native
  
  @js.native
  sealed trait ExportAssignment extends ReflectionFlag
  /* 32 */ val ExportAssignment: typings.typedoc.abstractMod.ReflectionFlag.ExportAssignment with Double = js.native
  
  @js.native
  sealed trait Exported extends ReflectionFlag
  /* 16 */ val Exported: typings.typedoc.abstractMod.ReflectionFlag.Exported with Double = js.native
  
  @js.native
  sealed trait External extends ReflectionFlag
  /* 64 */ val External: typings.typedoc.abstractMod.ReflectionFlag.External with Double = js.native
  
  @js.native
  sealed trait Let extends ReflectionFlag
  /* 8192 */ val Let: typings.typedoc.abstractMod.ReflectionFlag.Let with Double = js.native
  
  @js.native
  sealed trait None extends ReflectionFlag
  /* 0 */ val None: typings.typedoc.abstractMod.ReflectionFlag.None with Double = js.native
  
  @js.native
  sealed trait Optional extends ReflectionFlag
  /* 128 */ val Optional: typings.typedoc.abstractMod.ReflectionFlag.Optional with Double = js.native
  
  @js.native
  sealed trait Private extends ReflectionFlag
  /* 1 */ val Private: typings.typedoc.abstractMod.ReflectionFlag.Private with Double = js.native
  
  @js.native
  sealed trait Protected extends ReflectionFlag
  /* 2 */ val Protected: typings.typedoc.abstractMod.ReflectionFlag.Protected with Double = js.native
  
  @js.native
  sealed trait Public extends ReflectionFlag
  /* 4 */ val Public: typings.typedoc.abstractMod.ReflectionFlag.Public with Double = js.native
  
  @js.native
  sealed trait Readonly extends ReflectionFlag
  /* 16384 */ val Readonly: typings.typedoc.abstractMod.ReflectionFlag.Readonly with Double = js.native
  
  @js.native
  sealed trait Rest extends ReflectionFlag
  /* 512 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
  
  @js.native
  sealed trait Static extends ReflectionFlag
  /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
}
