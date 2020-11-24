package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedIdeType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "SupportedIdeType")
@js.native
object SupportedIdeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedIdeType with Double] = js.native
  
  @js.native
  sealed trait AndroidStudio extends SupportedIdeType
  /* 1 */ @js.native
  object AndroidStudio extends TopLevel[AndroidStudio with Double]
  
  @js.native
  sealed trait AppCode extends SupportedIdeType
  /* 2 */ @js.native
  object AppCode extends TopLevel[AppCode with Double]
  
  @js.native
  sealed trait CLion extends SupportedIdeType
  /* 3 */ @js.native
  object CLion extends TopLevel[CLion with Double]
  
  @js.native
  sealed trait DataGrip extends SupportedIdeType
  /* 4 */ @js.native
  object DataGrip extends TopLevel[DataGrip with Double]
  
  @js.native
  sealed trait Eclipse extends SupportedIdeType
  /* 13 */ @js.native
  object Eclipse extends TopLevel[Eclipse with Double]
  
  @js.native
  sealed trait IntelliJ extends SupportedIdeType
  /* 5 */ @js.native
  object IntelliJ extends TopLevel[IntelliJ with Double]
  
  @js.native
  sealed trait MPS extends SupportedIdeType
  /* 6 */ @js.native
  object MPS extends TopLevel[MPS with Double]
  
  @js.native
  sealed trait PhpStorm extends SupportedIdeType
  /* 7 */ @js.native
  object PhpStorm extends TopLevel[PhpStorm with Double]
  
  @js.native
  sealed trait PyCharm extends SupportedIdeType
  /* 8 */ @js.native
  object PyCharm extends TopLevel[PyCharm with Double]
  
  @js.native
  sealed trait RubyMine extends SupportedIdeType
  /* 9 */ @js.native
  object RubyMine extends TopLevel[RubyMine with Double]
  
  @js.native
  sealed trait Tower extends SupportedIdeType
  /* 10 */ @js.native
  object Tower extends TopLevel[Tower with Double]
  
  @js.native
  sealed trait Unknown extends SupportedIdeType
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  @js.native
  sealed trait VisualStudio extends SupportedIdeType
  /* 11 */ @js.native
  object VisualStudio extends TopLevel[VisualStudio with Double]
  
  @js.native
  sealed trait WebStorm extends SupportedIdeType
  /* 12 */ @js.native
  object WebStorm extends TopLevel[WebStorm with Double]
}
