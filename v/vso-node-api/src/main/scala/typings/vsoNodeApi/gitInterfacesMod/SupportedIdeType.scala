package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedIdeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "SupportedIdeType")
@js.native
object SupportedIdeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedIdeType & Double] = js.native
  
  @js.native
  sealed trait AndroidStudio
    extends StObject
       with SupportedIdeType
  /* 1 */ val AndroidStudio: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.AndroidStudio & Double = js.native
  
  @js.native
  sealed trait AppCode
    extends StObject
       with SupportedIdeType
  /* 2 */ val AppCode: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.AppCode & Double = js.native
  
  @js.native
  sealed trait CLion
    extends StObject
       with SupportedIdeType
  /* 3 */ val CLion: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.CLion & Double = js.native
  
  @js.native
  sealed trait DataGrip
    extends StObject
       with SupportedIdeType
  /* 4 */ val DataGrip: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.DataGrip & Double = js.native
  
  @js.native
  sealed trait Eclipse
    extends StObject
       with SupportedIdeType
  /* 13 */ val Eclipse: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Eclipse & Double = js.native
  
  @js.native
  sealed trait IntelliJ
    extends StObject
       with SupportedIdeType
  /* 5 */ val IntelliJ: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.IntelliJ & Double = js.native
  
  @js.native
  sealed trait MPS
    extends StObject
       with SupportedIdeType
  /* 6 */ val MPS: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.MPS & Double = js.native
  
  @js.native
  sealed trait PhpStorm
    extends StObject
       with SupportedIdeType
  /* 7 */ val PhpStorm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.PhpStorm & Double = js.native
  
  @js.native
  sealed trait PyCharm
    extends StObject
       with SupportedIdeType
  /* 8 */ val PyCharm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.PyCharm & Double = js.native
  
  @js.native
  sealed trait RubyMine
    extends StObject
       with SupportedIdeType
  /* 9 */ val RubyMine: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.RubyMine & Double = js.native
  
  @js.native
  sealed trait Tower
    extends StObject
       with SupportedIdeType
  /* 10 */ val Tower: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Tower & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SupportedIdeType
  /* 0 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Unknown & Double = js.native
  
  @js.native
  sealed trait VisualStudio
    extends StObject
       with SupportedIdeType
  /* 11 */ val VisualStudio: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.VisualStudio & Double = js.native
  
  @js.native
  sealed trait WebStorm
    extends StObject
       with SupportedIdeType
  /* 12 */ val WebStorm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.WebStorm & Double = js.native
}
