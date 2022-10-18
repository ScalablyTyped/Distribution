package typings.swcCore.typesMod

import typings.swcCore.anon.Comments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ParseOptions = ParserConfig & Comments

type Plugin = js.Function1[/* module */ Program, Program]

type Swcrc = Config | js.Array[Config]

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.swcCoreInts.`5`
  - typings.swcCore.swcCoreInts.`2015`
  - typings.swcCore.swcCoreInts.`2016`
  - java.lang.String
  - scala.Double
*/
type TerserEcmaVersion = _TerserEcmaVersion | String | Double
