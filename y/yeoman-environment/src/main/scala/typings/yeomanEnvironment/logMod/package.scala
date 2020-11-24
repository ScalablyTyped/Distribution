package typings.yeomanEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object logMod {
  
  /**
    * Provides a set of colors.
    */
  type ColorMap[TKeys /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in TKeys ]: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color * / any | / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Modifiers * / any}
    */ typings.yeomanEnvironment.yeomanEnvironmentStrings.ColorMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * Provides the functionality to log messages.
    */
  type Logger[TCategories /* <: java.lang.String | scala.Double | js.Symbol */] = typings.node.eventsMod.EventEmitter with typings.yeomanEnvironment.yeomanEnvironmentStrings.Logger with org.scalablytyped.runtime.TopLevel[js.Any] with typings.yeomanEnvironment.anon.Call
}
