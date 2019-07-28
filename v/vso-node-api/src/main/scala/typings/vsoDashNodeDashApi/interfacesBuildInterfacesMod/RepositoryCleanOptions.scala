package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RepositoryCleanOptions extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "RepositoryCleanOptions")
@js.native
object RepositoryCleanOptions extends js.Object {
  /**
    * Re-create $(agnet.buildDirectory) which contains $(build.sourcesDirectory), $(build.binariesDirectory) and any folders that left from previous build.
    */
  @js.native
  sealed trait AllBuildDir extends RepositoryCleanOptions
  
  @js.native
  sealed trait Source extends RepositoryCleanOptions
  
  @js.native
  sealed trait SourceAndOutputDir extends RepositoryCleanOptions
  
  /**
    * Re-create $(build.sourcesDirectory)
    */
  @js.native
  sealed trait SourceDir extends RepositoryCleanOptions
  
  /* 3 */ val AllBuildDir: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.AllBuildDir with Double = js.native
  /* 0 */ val Source: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.Source with Double = js.native
  /* 1 */ val SourceAndOutputDir: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceAndOutputDir with Double = js.native
  /* 2 */ val SourceDir: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceDir with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RepositoryCleanOptions with Double] = js.native
}

