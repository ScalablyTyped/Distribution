package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.AllBuildDir
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.Source
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceAndOutputDir
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryCleanOptions.SourceDir
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RepositoryCleanOptions with Double] = js.native
  /* 3 */ @js.native
  object AllBuildDir extends TopLevel[AllBuildDir with Double]
  
  /* 0 */ @js.native
  object Source extends TopLevel[Source with Double]
  
  /* 1 */ @js.native
  object SourceAndOutputDir extends TopLevel[SourceAndOutputDir with Double]
  
  /* 2 */ @js.native
  object SourceDir extends TopLevel[SourceDir with Double]
  
}

