package typings.yeomanEnvironment

import typings.yeomanEnvironment.conflicterMod.Status
import typings.yeomanEnvironment.logMod.DefaultCategories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yeomanEnvironmentStrings {
  
  @js.native
  sealed trait ColorMap extends StObject
  inline def ColorMap: ColorMap = "ColorMap".asInstanceOf[ColorMap]
  
  @js.native
  sealed trait Logger extends StObject
  inline def Logger: Logger = "Logger".asInstanceOf[Logger]
  
  @js.native
  sealed trait conflict
    extends StObject
       with DefaultCategories
  inline def conflict: conflict = "conflict".asInstanceOf[conflict]
  
  @js.native
  sealed trait create
    extends StObject
       with DefaultCategories
       with Status
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait force
    extends StObject
       with DefaultCategories
       with Status
  inline def force: force = "force".asInstanceOf[force]
  
  @js.native
  sealed trait identical
    extends StObject
       with DefaultCategories
       with Status
  inline def identical: identical = "identical".asInstanceOf[identical]
  
  @js.native
  sealed trait info
    extends StObject
       with DefaultCategories
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait invoke
    extends StObject
       with DefaultCategories
  inline def invoke: invoke = "invoke".asInstanceOf[invoke]
  
  @js.native
  sealed trait skip
    extends StObject
       with DefaultCategories
       with Status
  inline def skip: skip = "skip".asInstanceOf[skip]
}
