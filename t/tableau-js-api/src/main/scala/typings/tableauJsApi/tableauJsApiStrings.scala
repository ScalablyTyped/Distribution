package typings.tableauJsApi

import typings.tableauJsApi.vizMod.DeviceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableauJsApiStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with DeviceType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ATLEAST extends StObject
  inline def ATLEAST: ATLEAST = "ATLEAST".asInstanceOf[ATLEAST]
  
  @js.native
  sealed trait ATMOST extends StObject
  inline def ATMOST: ATMOST = "ATMOST".asInstanceOf[ATMOST]
  
  @js.native
  sealed trait AUTOMATIC extends StObject
  inline def AUTOMATIC: AUTOMATIC = "AUTOMATIC".asInstanceOf[AUTOMATIC]
  
  @js.native
  sealed trait EXACTLY extends StObject
  inline def EXACTLY: EXACTLY = "EXACTLY".asInstanceOf[EXACTLY]
  
  @js.native
  sealed trait RANGE extends StObject
  inline def RANGE: RANGE = "RANGE".asInstanceOf[RANGE]
  
  @js.native
  sealed trait desktop
    extends StObject
       with DeviceType
  inline def desktop: desktop = "desktop".asInstanceOf[desktop]
  
  @js.native
  sealed trait phone
    extends StObject
       with DeviceType
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait tablet
    extends StObject
       with DeviceType
  inline def tablet: tablet = "tablet".asInstanceOf[tablet]
}
