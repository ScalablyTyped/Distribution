package typings.wallabyjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IWallabyBuiltInCompilerOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type IWallabyCompilers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type IWallabyProcessor = org.scalablytyped.runtime.StringDictionary[js.Function1[/* file */ typings.wallabyjs.mod.IWallabyFile, scala.Unit]]
}
