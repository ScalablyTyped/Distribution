package typings.webpackFilesArchivePlugin

import typings.webpackFilesArchivePlugin.mod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackFilesArchivePluginStrings {
  
  @js.native
  sealed trait tar
    extends StObject
       with Formats
  inline def tar: tar = "tar".asInstanceOf[tar]
  
  @js.native
  sealed trait zip
    extends StObject
       with Formats
  inline def zip: zip = "zip".asInstanceOf[zip]
}
