package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedIdeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "SupportedIdeType")
@js.native
object SupportedIdeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedIdeType with Double] = js.native
  
  @js.native
  sealed trait AndroidStudio extends SupportedIdeType
  /* 1 */ val AndroidStudio: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.AndroidStudio with Double = js.native
  
  @js.native
  sealed trait AppCode extends SupportedIdeType
  /* 2 */ val AppCode: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.AppCode with Double = js.native
  
  @js.native
  sealed trait CLion extends SupportedIdeType
  /* 3 */ val CLion: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.CLion with Double = js.native
  
  @js.native
  sealed trait DataGrip extends SupportedIdeType
  /* 4 */ val DataGrip: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.DataGrip with Double = js.native
  
  @js.native
  sealed trait Eclipse extends SupportedIdeType
  /* 13 */ val Eclipse: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Eclipse with Double = js.native
  
  @js.native
  sealed trait IntelliJ extends SupportedIdeType
  /* 5 */ val IntelliJ: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.IntelliJ with Double = js.native
  
  @js.native
  sealed trait MPS extends SupportedIdeType
  /* 6 */ val MPS: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.MPS with Double = js.native
  
  @js.native
  sealed trait PhpStorm extends SupportedIdeType
  /* 7 */ val PhpStorm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.PhpStorm with Double = js.native
  
  @js.native
  sealed trait PyCharm extends SupportedIdeType
  /* 8 */ val PyCharm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.PyCharm with Double = js.native
  
  @js.native
  sealed trait RubyMine extends SupportedIdeType
  /* 9 */ val RubyMine: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.RubyMine with Double = js.native
  
  @js.native
  sealed trait Tower extends SupportedIdeType
  /* 10 */ val Tower: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Tower with Double = js.native
  
  @js.native
  sealed trait Unknown extends SupportedIdeType
  /* 0 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.Unknown with Double = js.native
  
  @js.native
  sealed trait VisualStudio extends SupportedIdeType
  /* 11 */ val VisualStudio: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.VisualStudio with Double = js.native
  
  @js.native
  sealed trait WebStorm extends SupportedIdeType
  /* 12 */ val WebStorm: typings.vsoNodeApi.gitInterfacesMod.SupportedIdeType.WebStorm with Double = js.native
}
