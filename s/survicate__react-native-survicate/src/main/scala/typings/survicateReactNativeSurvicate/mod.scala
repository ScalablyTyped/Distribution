package typings.survicateReactNativeSurvicate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@survicate/react-native-survicate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def enterScreen(screenName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enterScreen")(screenName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
    
    inline def invokeEvent(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def leaveScreen(screenName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("leaveScreen")(screenName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    inline def setUserId(screenName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(screenName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setUserTrait(traitName: String, traitValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserTrait")(traitName.asInstanceOf[js.Any], traitValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
