package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RepositoryCleanOptions extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "RepositoryCleanOptions")
@js.native
object RepositoryCleanOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RepositoryCleanOptions & Double] = js.native
  
  /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
  @js.native
  sealed trait AllBuildDir
    extends StObject
       with RepositoryCleanOptions
  /* 3 */ val AllBuildDir: typings.vsoNodeApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.AllBuildDir & Double = js.native
  
  @js.native
  sealed trait Source
    extends StObject
       with RepositoryCleanOptions
  /* 0 */ val Source: typings.vsoNodeApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.Source & Double = js.native
  
  @js.native
  sealed trait SourceAndOutputDir
    extends StObject
       with RepositoryCleanOptions
  /* 1 */ val SourceAndOutputDir: typings.vsoNodeApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceAndOutputDir & Double = js.native
  
  /**
    * Re-create $(build.sourcesDirectory)
    */
  @js.native
  sealed trait SourceDir
    extends StObject
       with RepositoryCleanOptions
  /* 2 */ val SourceDir: typings.vsoNodeApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceDir & Double = js.native
}
