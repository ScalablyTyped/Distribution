package typings.yeomanEnvironment

import typings.yeomanEnvironment.logMod.DefaultCategories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yeomanEnvironmentStrings {
  
  @scala.inline
  def ColorMap: ColorMap = "ColorMap".asInstanceOf[ColorMap]
  
  @scala.inline
  def Logger: Logger = "Logger".asInstanceOf[Logger]
  
  @scala.inline
  def conflict: conflict = "conflict".asInstanceOf[conflict]
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def force: force = "force".asInstanceOf[force]
  
  @scala.inline
  def identical: identical = "identical".asInstanceOf[identical]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def invoke: invoke = "invoke".asInstanceOf[invoke]
  
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
  
  @js.native
  sealed trait ColorMap extends js.Object
  
  @js.native
  sealed trait Logger extends js.Object
  
  @js.native
  sealed trait conflict extends DefaultCategories
  
  @js.native
  sealed trait create extends DefaultCategories
  
  @js.native
  sealed trait force extends DefaultCategories
  
  @js.native
  sealed trait identical extends DefaultCategories
  
  @js.native
  sealed trait info extends DefaultCategories
  
  @js.native
  sealed trait invoke extends DefaultCategories
  
  @js.native
  sealed trait skip extends DefaultCategories
}
