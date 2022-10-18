package typings.undici

import typings.undici.typesFetchMod.ResponseRedirectStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undiciInts {
  
  @js.native
  sealed trait `301`
    extends StObject
       with ResponseRedirectStatus
  inline def `301`: `301` = 301.asInstanceOf[`301`]
  
  @js.native
  sealed trait `302`
    extends StObject
       with ResponseRedirectStatus
  inline def `302`: `302` = 302.asInstanceOf[`302`]
  
  @js.native
  sealed trait `303`
    extends StObject
       with ResponseRedirectStatus
  inline def `303`: `303` = 303.asInstanceOf[`303`]
  
  @js.native
  sealed trait `307`
    extends StObject
       with ResponseRedirectStatus
  inline def `307`: `307` = 307.asInstanceOf[`307`]
  
  @js.native
  sealed trait `308`
    extends StObject
       with ResponseRedirectStatus
  inline def `308`: `308` = 308.asInstanceOf[`308`]
}
