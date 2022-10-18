package typings.swr

import typings.swr.distUtilsStateMod.StateKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swrStrings {
  
  @js.native
  sealed trait data
    extends StObject
       with StateKeys
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait error
    extends StObject
       with StateKeys
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait isValidating
    extends StObject
       with StateKeys
  inline def isValidating: isValidating = "isValidating".asInstanceOf[isValidating]
}
