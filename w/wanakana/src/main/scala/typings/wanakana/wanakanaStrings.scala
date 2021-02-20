package typings.wanakana

import typings.wanakana.mod.IMEModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wanakanaStrings {
  
  @js.native
  sealed trait hepburn extends StObject
  @scala.inline
  def hepburn: hepburn = "hepburn".asInstanceOf[hepburn]
  
  @js.native
  sealed trait toHiragana extends IMEModes
  @scala.inline
  def toHiragana: toHiragana = "toHiragana".asInstanceOf[toHiragana]
  
  @js.native
  sealed trait toKatakana extends IMEModes
  @scala.inline
  def toKatakana: toKatakana = "toKatakana".asInstanceOf[toKatakana]
}
