package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RepositoryCleanOptions extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "RepositoryCleanOptions")
@js.native
object RepositoryCleanOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RepositoryCleanOptions with Double] = js.native
  
  /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
  @js.native
  sealed trait AllBuildDir extends RepositoryCleanOptions
  /* 3 */ val AllBuildDir: typings.vsoNodeApi.buildInterfacesMod.RepositoryCleanOptions.AllBuildDir with Double = js.native
  
  @js.native
  sealed trait Source extends RepositoryCleanOptions
  /* 0 */ val Source: typings.vsoNodeApi.buildInterfacesMod.RepositoryCleanOptions.Source with Double = js.native
  
  @js.native
  sealed trait SourceAndOutputDir extends RepositoryCleanOptions
  /* 1 */ val SourceAndOutputDir: typings.vsoNodeApi.buildInterfacesMod.RepositoryCleanOptions.SourceAndOutputDir with Double = js.native
  
  /**
    * Re-create $(build.sourcesDirectory)
    */
  @js.native
  sealed trait SourceDir extends RepositoryCleanOptions
  /* 2 */ val SourceDir: typings.vsoNodeApi.buildInterfacesMod.RepositoryCleanOptions.SourceDir with Double = js.native
}
