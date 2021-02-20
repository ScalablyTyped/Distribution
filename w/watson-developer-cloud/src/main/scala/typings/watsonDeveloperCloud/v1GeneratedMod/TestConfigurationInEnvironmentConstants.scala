package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `testConfigurationInEnvironment` operation. */
object TestConfigurationInEnvironmentConstants {
  
  @js.native
  sealed trait FileContentType extends StObject
  /** The content type of file. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "TestConfigurationInEnvironmentConstants.FileContentType")
  @js.native
  object FileContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends FileContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_PDF with String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    @js.native
    sealed trait APPLICATION_XHTML_XML extends FileContentType
    /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_XHTML_XML with String = js.native
    
    @js.native
    sealed trait TEXT_HTML extends FileContentType
    /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.TEXT_HTML with String = js.native
  }
  
  @js.native
  sealed trait Step extends StObject
  /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "TestConfigurationInEnvironmentConstants.Step")
  @js.native
  object Step extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Step with String] = js.native
    
    @js.native
    sealed trait ENRICHMENTS_OUTPUT extends Step
    /* "enrichments_output" */ val ENRICHMENTS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.ENRICHMENTS_OUTPUT with String = js.native
    
    @js.native
    sealed trait HTML_INPUT extends Step
    /* "html_input" */ val HTML_INPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_INPUT with String = js.native
    
    @js.native
    sealed trait HTML_OUTPUT extends Step
    /* "html_output" */ val HTML_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_OUTPUT with String = js.native
    
    @js.native
    sealed trait JSON_NORMALIZATIONS_OUTPUT extends Step
    /* "json_normalizations_output" */ val JSON_NORMALIZATIONS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_NORMALIZATIONS_OUTPUT with String = js.native
    
    @js.native
    sealed trait JSON_OUTPUT extends Step
    /* "json_output" */ val JSON_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_OUTPUT with String = js.native
    
    @js.native
    sealed trait NORMALIZATIONS_OUTPUT extends Step
    /* "normalizations_output" */ val NORMALIZATIONS_OUTPUT: typings.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.NORMALIZATIONS_OUTPUT with String = js.native
  }
}
