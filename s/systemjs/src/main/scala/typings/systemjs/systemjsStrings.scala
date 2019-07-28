package typings.systemjs

import typings.systemjs.systemjsMod.ModuleFormat
import typings.systemjs.systemjsMod.Transpiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object systemjsStrings {
  @js.native
  sealed trait amd extends ModuleFormat
  
  @js.native
  sealed trait babel extends Transpiler
  
  @js.native
  sealed trait cjs extends ModuleFormat
  
  @js.native
  sealed trait esm extends ModuleFormat
  
  @js.native
  sealed trait global extends ModuleFormat
  
  @js.native
  sealed trait `plugin-babel` extends Transpiler
  
  @js.native
  sealed trait `plugin-traceur` extends Transpiler
  
  @js.native
  sealed trait `plugin-typescript` extends Transpiler
  
  @js.native
  sealed trait register extends ModuleFormat
  
  @js.native
  sealed trait traceur extends Transpiler
  
  @js.native
  sealed trait typescript extends Transpiler
  
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

