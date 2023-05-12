package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import typings.std.Record
import typings.webextensionPolyfill.namespacesExperimentsMod.Experiments.ExperimentAPI
import typings.webextensionPolyfill.webextensionPolyfillStrings.Lessthansignall_urlsGreaterthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExtensionFileUrl = String

type ExtensionID = String

type ExtensionURL = String

type HttpURL = String

type IconImageData = (Record[String, ImageData]) | ImageData

type IconPath = (Record[String, ExtensionFileUrl]) | ExtensionFileUrl

type ImageDataOrExtensionURL = String

type KeyName = String

type MatchPattern = Lessthansignall_urlsGreaterthansign | MatchPatternRestricted | MatchPatternUnestricted

/**
  * Same as MatchPattern above, but excludes <all_urls>
  */
type MatchPatternRestricted = String

/**
  * Mostly unrestricted match patterns for privileged add-ons. This should technically be rejected for unprivileged add-ons,
  * but, reasons. The MatchPattern class will still refuse privileged schemes for those extensions.
  */
type MatchPatternUnestricted = String

type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern

/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.namespacesManifestMod.Manifest.PermissionNoPrompt
  - typings.webextensionPolyfill.namespacesManifestMod.Manifest.OptionalPermission
  - typings.webextensionPolyfill.webextensionPolyfillStrings.declarativeNetRequest
  - java.lang.String
*/
type Permission = _Permission | String

type PermissionOrOrigin = Permission | MatchPattern

type Static = StringDictionary[Any]

type ThemeColor = String | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type ThemeExperimentColorsType = StringDictionary[Any]

type ThemeExperimentImagesType = StringDictionary[Any]

type ThemeExperimentPropertiesType = StringDictionary[Any]

type WebExtensionManifestExperimentApisType = StringDictionary[ExperimentAPI]
