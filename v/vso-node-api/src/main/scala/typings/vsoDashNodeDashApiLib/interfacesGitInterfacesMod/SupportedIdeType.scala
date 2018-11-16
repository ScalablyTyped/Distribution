package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SupportedIdeType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "SupportedIdeType")
@js.native
object SupportedIdeType extends js.Object {
  @js.native
  sealed trait AndroidStudio
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait AppCode
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait CLion
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait DataGrip
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait Eclipse
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait IntelliJ
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait MPS
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait PhpStorm
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait PyCharm
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait RubyMine
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait Tower
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait VisualStudio
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  @js.native
  sealed trait WebStorm
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType
  
  /* 1 */ val AndroidStudio: AndroidStudio with scala.Double = js.native
  /* 2 */ val AppCode: AppCode with scala.Double = js.native
  /* 3 */ val CLion: CLion with scala.Double = js.native
  /* 4 */ val DataGrip: DataGrip with scala.Double = js.native
  /* 13 */ val Eclipse: Eclipse with scala.Double = js.native
  /* 5 */ val IntelliJ: IntelliJ with scala.Double = js.native
  /* 6 */ val MPS: MPS with scala.Double = js.native
  /* 7 */ val PhpStorm: PhpStorm with scala.Double = js.native
  /* 8 */ val PyCharm: PyCharm with scala.Double = js.native
  /* 9 */ val RubyMine: RubyMine with scala.Double = js.native
  /* 10 */ val Tower: Tower with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 11 */ val VisualStudio: VisualStudio with scala.Double = js.native
  /* 12 */ val WebStorm: WebStorm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.SupportedIdeType with scala.Double
  ] = js.native
}

