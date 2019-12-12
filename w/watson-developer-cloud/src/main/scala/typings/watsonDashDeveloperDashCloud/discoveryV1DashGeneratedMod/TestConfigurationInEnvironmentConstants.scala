package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_JSON
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_MSWORD
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_PDF
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_XHTML_XML
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.TEXT_HTML
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.ENRICHMENTS_OUTPUT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_INPUT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_OUTPUT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_NORMALIZATIONS_OUTPUT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_OUTPUT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.TestConfigurationInEnvironmentConstants.Step.NORMALIZATIONS_OUTPUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `testConfigurationInEnvironment` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "TestConfigurationInEnvironmentConstants")
@js.native
object TestConfigurationInEnvironmentConstants extends js.Object {
  @js.native
  sealed trait FileContentType extends js.Object
  
  @js.native
  sealed trait Step extends js.Object
  
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    @js.native
    sealed trait APPLICATION_JSON extends FileContentType
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    
    @js.native
    sealed trait APPLICATION_XHTML_XML extends FileContentType
    
    @js.native
    sealed trait TEXT_HTML extends FileContentType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    /* "application/json" */ @js.native
    object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
    
    /* "application/msword" */ @js.native
    object APPLICATION_MSWORD extends TopLevel[APPLICATION_MSWORD with String]
    
    /* "application/pdf" */ @js.native
    object APPLICATION_PDF extends TopLevel[APPLICATION_PDF with String]
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ @js.native
    object APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends TopLevel[
              APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String
            ]
    
    /* "application/xhtml+xml" */ @js.native
    object APPLICATION_XHTML_XML extends TopLevel[APPLICATION_XHTML_XML with String]
    
    /* "text/html" */ @js.native
    object TEXT_HTML extends TopLevel[TEXT_HTML with String]
    
  }
  
  /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
  @js.native
  object Step extends js.Object {
    @js.native
    sealed trait ENRICHMENTS_OUTPUT extends Step
    
    @js.native
    sealed trait HTML_INPUT extends Step
    
    @js.native
    sealed trait HTML_OUTPUT extends Step
    
    @js.native
    sealed trait JSON_NORMALIZATIONS_OUTPUT extends Step
    
    @js.native
    sealed trait JSON_OUTPUT extends Step
    
    @js.native
    sealed trait NORMALIZATIONS_OUTPUT extends Step
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Step with String] = js.native
    /* "enrichments_output" */ @js.native
    object ENRICHMENTS_OUTPUT extends TopLevel[ENRICHMENTS_OUTPUT with String]
    
    /* "html_input" */ @js.native
    object HTML_INPUT extends TopLevel[HTML_INPUT with String]
    
    /* "html_output" */ @js.native
    object HTML_OUTPUT extends TopLevel[HTML_OUTPUT with String]
    
    /* "json_normalizations_output" */ @js.native
    object JSON_NORMALIZATIONS_OUTPUT extends TopLevel[JSON_NORMALIZATIONS_OUTPUT with String]
    
    /* "json_output" */ @js.native
    object JSON_OUTPUT extends TopLevel[JSON_OUTPUT with String]
    
    /* "normalizations_output" */ @js.native
    object NORMALIZATIONS_OUTPUT extends TopLevel[NORMALIZATIONS_OUTPUT with String]
    
  }
  
}

