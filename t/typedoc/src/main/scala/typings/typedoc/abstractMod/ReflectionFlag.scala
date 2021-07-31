package typings.typedoc.abstractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReflectionFlag extends StObject
@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlag")
@js.native
object ReflectionFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionFlag & Double] = js.native
  
  @js.native
  sealed trait Abstract
    extends StObject
       with ReflectionFlag
  /* 2048 */ val Abstract: typings.typedoc.abstractMod.ReflectionFlag.Abstract & Double = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with ReflectionFlag
  /* 4096 */ val Const: typings.typedoc.abstractMod.ReflectionFlag.Const & Double = js.native
  
  @js.native
  sealed trait ConstructorProperty
    extends StObject
       with ReflectionFlag
  /* 1024 */ val ConstructorProperty: typings.typedoc.abstractMod.ReflectionFlag.ConstructorProperty & Double = js.native
  
  @js.native
  sealed trait DefaultValue
    extends StObject
       with ReflectionFlag
  /* 256 */ val DefaultValue: typings.typedoc.abstractMod.ReflectionFlag.DefaultValue & Double = js.native
  
  @js.native
  sealed trait ExportAssignment
    extends StObject
       with ReflectionFlag
  /* 32 */ val ExportAssignment: typings.typedoc.abstractMod.ReflectionFlag.ExportAssignment & Double = js.native
  
  @js.native
  sealed trait Exported
    extends StObject
       with ReflectionFlag
  /* 16 */ val Exported: typings.typedoc.abstractMod.ReflectionFlag.Exported & Double = js.native
  
  @js.native
  sealed trait External
    extends StObject
       with ReflectionFlag
  /* 64 */ val External: typings.typedoc.abstractMod.ReflectionFlag.External & Double = js.native
  
  @js.native
  sealed trait Let
    extends StObject
       with ReflectionFlag
  /* 8192 */ val Let: typings.typedoc.abstractMod.ReflectionFlag.Let & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReflectionFlag
  /* 0 */ val None: typings.typedoc.abstractMod.ReflectionFlag.None & Double = js.native
  
  @js.native
  sealed trait Optional
    extends StObject
       with ReflectionFlag
  /* 128 */ val Optional: typings.typedoc.abstractMod.ReflectionFlag.Optional & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with ReflectionFlag
  /* 1 */ val Private: typings.typedoc.abstractMod.ReflectionFlag.Private & Double = js.native
  
  @js.native
  sealed trait Protected
    extends StObject
       with ReflectionFlag
  /* 2 */ val Protected: typings.typedoc.abstractMod.ReflectionFlag.Protected & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with ReflectionFlag
  /* 4 */ val Public: typings.typedoc.abstractMod.ReflectionFlag.Public & Double = js.native
  
  @js.native
  sealed trait Readonly
    extends StObject
       with ReflectionFlag
  /* 16384 */ val Readonly: typings.typedoc.abstractMod.ReflectionFlag.Readonly & Double = js.native
  
  @js.native
  sealed trait Rest
    extends StObject
       with ReflectionFlag
  /* 512 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest & Double = js.native
  
  @js.native
  sealed trait Static
    extends StObject
       with ReflectionFlag
  /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static & Double = js.native
}
