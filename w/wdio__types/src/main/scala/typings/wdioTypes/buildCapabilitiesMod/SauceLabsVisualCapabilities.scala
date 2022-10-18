package typings.wdioTypes.buildCapabilitiesMod

import typings.wdioTypes.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceLabsVisualCapabilities extends StObject {
  
  /**
    * Option to automatically accept new and changed states in base branch.
    * Assumes base branch should always be correct.
    * @default false
    */
  var alwaysAcceptBaseBranch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * API Key for user's Screener account.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * Branch name of project's base branch. Used for baseline branching and merging.
    * @example "main"
    */
  var baseBranch: js.UndefOr[String] = js.undefined
  
  /**
    * Branch or environment name.
    * @example "main"
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * Visual diff options to control validations.
    * @default
    * ```js
    * {
    *   structure: true,
    *   layout: true,
    *   style: true,
    *   content: true,
    *   minLayoutPosition: 4,
    *   minLayoutDimension: 10
    * }
    * ```
    */
  var diffOptions: js.UndefOr[Content] = js.undefined
  
  /**
    * Option to disable independent baseline for each feature branch, and
    * only use base branch as baseline. Must be used with "baseBranch" option.
    * @default false
    */
  var disableBranchBaseline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option to disable adding CORS headers. By default, CORS headers are set
    * for all cross-origin requests.
    * @default false
    */
  var disableCORS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option to set build to failure when new states are found, and to disable
    * using new states as a baseline.
    *
    * This option defaults to true, and can be set to false if user wants new
    * states to automatically be the visual baseline without needing to review
    * and accept them.
    * @default true
    */
  var failOnNewStates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A comma-delimited list of css selectors to ignore when performing visual diffs.
    * @example "#some-id, .some-selector"
    */
  var ignore: js.UndefOr[String] = js.undefined
  
  /**
    * Project name
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * Option to capture a full-page screenshot using a scrolling and stitching
    * strategy instead of using native browser full-page screenshot capabilities.
    * @default false
    */
  var scrollAndStitchScreenshots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A <width>x<height> representation of desired viewport size.
    * @default "1024x768"
    */
  var viewportSize: js.UndefOr[String] = js.undefined
}
object SauceLabsVisualCapabilities {
  
  inline def apply(): SauceLabsVisualCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceLabsVisualCapabilities]
  }
  
  extension [Self <: SauceLabsVisualCapabilities](x: Self) {
    
    inline def setAlwaysAcceptBaseBranch(value: Boolean): Self = StObject.set(x, "alwaysAcceptBaseBranch", value.asInstanceOf[js.Any])
    
    inline def setAlwaysAcceptBaseBranchUndefined: Self = StObject.set(x, "alwaysAcceptBaseBranch", js.undefined)
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setBaseBranch(value: String): Self = StObject.set(x, "baseBranch", value.asInstanceOf[js.Any])
    
    inline def setBaseBranchUndefined: Self = StObject.set(x, "baseBranch", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setDiffOptions(value: Content): Self = StObject.set(x, "diffOptions", value.asInstanceOf[js.Any])
    
    inline def setDiffOptionsUndefined: Self = StObject.set(x, "diffOptions", js.undefined)
    
    inline def setDisableBranchBaseline(value: Boolean): Self = StObject.set(x, "disableBranchBaseline", value.asInstanceOf[js.Any])
    
    inline def setDisableBranchBaselineUndefined: Self = StObject.set(x, "disableBranchBaseline", js.undefined)
    
    inline def setDisableCORS(value: Boolean): Self = StObject.set(x, "disableCORS", value.asInstanceOf[js.Any])
    
    inline def setDisableCORSUndefined: Self = StObject.set(x, "disableCORS", js.undefined)
    
    inline def setFailOnNewStates(value: Boolean): Self = StObject.set(x, "failOnNewStates", value.asInstanceOf[js.Any])
    
    inline def setFailOnNewStatesUndefined: Self = StObject.set(x, "failOnNewStates", js.undefined)
    
    inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setScrollAndStitchScreenshots(value: Boolean): Self = StObject.set(x, "scrollAndStitchScreenshots", value.asInstanceOf[js.Any])
    
    inline def setScrollAndStitchScreenshotsUndefined: Self = StObject.set(x, "scrollAndStitchScreenshots", js.undefined)
    
    inline def setViewportSize(value: String): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
  }
}
