package typings.typedoc.distLibModelsReflectionsAbstractMod

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
  sealed trait Rest extends ReflectionFlag
  
  @js.native
  sealed trait Static extends ReflectionFlag
  
  /* 2048 */ val Abstract: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract with Double = js.native
  /* 4096 */ val Const: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const with Double = js.native
  /* 1024 */ val ConstructorProperty: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
  /* 256 */ val DefaultValue: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue with Double = js.native
  /* 32 */ val ExportAssignment: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment with Double = js.native
  /* 16 */ val Exported: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Exported with Double = js.native
  /* 64 */ val External: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External with Double = js.native
  /* 8192 */ val Let: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let with Double = js.native
  /* 0 */ val None: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None with Double = js.native
  /* 128 */ val Optional: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional with Double = js.native
  /* 1 */ val Private: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private with Double = js.native
  /* 2 */ val Protected: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected with Double = js.native
  /* 4 */ val Public: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public with Double = js.native
  /* 512 */ val Rest: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest with Double = js.native
  /* 8 */ val Static: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionFlag with Double] = js.native
}

