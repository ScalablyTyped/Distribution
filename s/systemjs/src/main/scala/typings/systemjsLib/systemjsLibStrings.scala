package typings
package systemjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object systemjsLibStrings {
  @js.native
  sealed trait amd
    extends systemjsLib.systemjsMod.ModuleFormat
  
  @js.native
  sealed trait babel
    extends systemjsLib.systemjsMod.Transpiler
  
  @js.native
  sealed trait cjs
    extends systemjsLib.systemjsMod.ModuleFormat
  
  @js.native
  sealed trait esm
    extends systemjsLib.systemjsMod.ModuleFormat
  
  @js.native
  sealed trait global
    extends systemjsLib.systemjsMod.ModuleFormat
  
  @js.native
  sealed trait `plugin-babel`
    extends systemjsLib.systemjsMod.Transpiler
  
  @js.native
  sealed trait `plugin-traceur`
    extends systemjsLib.systemjsMod.Transpiler
  
  @js.native
  sealed trait `plugin-typescript`
    extends systemjsLib.systemjsMod.Transpiler
  
  @js.native
  sealed trait register
    extends systemjsLib.systemjsMod.ModuleFormat
  
  @js.native
  sealed trait traceur
    extends systemjsLib.systemjsMod.Transpiler
  
  @js.native
  sealed trait typescript
    extends systemjsLib.systemjsMod.Transpiler
  
  @scala.inline
  def amd: amd = "amd".asInstanceOf[amd]
  @scala.inline
  def babel: babel = "babel".asInstanceOf[babel]
  @scala.inline
  def cjs: cjs = "cjs".asInstanceOf[cjs]
  @scala.inline
  def esm: esm = "esm".asInstanceOf[esm]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def `plugin-babel`: `plugin-babel` = "plugin-babel".asInstanceOf[`plugin-babel`]
  @scala.inline
  def `plugin-traceur`: `plugin-traceur` = "plugin-traceur".asInstanceOf[`plugin-traceur`]
  @scala.inline
  def `plugin-typescript`: `plugin-typescript` = "plugin-typescript".asInstanceOf[`plugin-typescript`]
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def traceur: traceur = "traceur".asInstanceOf[traceur]
  @scala.inline
  def typescript: typescript = "typescript".asInstanceOf[typescript]
}

