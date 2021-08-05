package typings.webpackConfigUtils

import typings.webpackConfigUtils.mod.EnvVars
import typings.webpackConfigUtils.mod._Falsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackConfigUtilsStrings {
  
  @js.native
  sealed trait NonEmptyObject extends StObject
  inline def NonEmptyObject: NonEmptyObject = "NonEmptyObject".asInstanceOf[NonEmptyObject]
  
  @js.native
  sealed trait _empty
    extends StObject
       with _Falsy
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait dev
    extends StObject
       with EnvVars
  inline def dev: dev = "dev".asInstanceOf[dev]
  
  @js.native
  sealed trait development
    extends StObject
       with EnvVars
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait `false`
    extends StObject
       with _Falsy
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait getIfUtils extends StObject
  inline def getIfUtils: getIfUtils = "getIfUtils".asInstanceOf[getIfUtils]
  
  @js.native
  sealed trait prod
    extends StObject
       with EnvVars
  inline def prod: prod = "prod".asInstanceOf[prod]
  
  @js.native
  sealed trait production
    extends StObject
       with EnvVars
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait removeEmpty extends StObject
  inline def removeEmpty: removeEmpty = "removeEmpty".asInstanceOf[removeEmpty]
  
  @js.native
  sealed trait test
    extends StObject
       with EnvVars
  inline def test: test = "test".asInstanceOf[test]
}
