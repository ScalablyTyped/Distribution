package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.anon.Paths
import typings.thunderbirdWebextBrowser.anon.Version
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.Lessthansignall_urlsGreaterthansign
import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.declarativeNetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExtensionFileUrl = String

type ExtensionID = String

type ExtensionURL = String

type HttpURL = String

type IconImageData = NumberDictionary[ImageData] | ImageData

type IconPath = NumberDictionary[ExtensionFileUrl] | ExtensionFileUrl

type ImageData = Any

type ImageDataOrExtensionURL = String

type KeyName = String

type MatchPattern = MatchPatternRestricted | MatchPatternUnestricted | Lessthansignall_urlsGreaterthansign

type MatchPatternRestricted = String

type MatchPatternUnestricted = String

type OptionalPermission = OptionalPermissionNoPrompt | _OptionalPermission

type OptionalPermissionNoPrompt = _OptionalPermissionNoPrompt

type OptionalPermissionOrOrigin = OptionalPermission | MatchPattern

type Permission = String | PermissionNoPrompt | OptionalPermission | declarativeNetRequest

type PermissionNoPrompt = OptionalPermissionNoPrompt | PermissionPrivileged | _PermissionNoPrompt

type PermissionOrOrigin = Permission | MatchPattern

type PermissionPrivileged = _PermissionPrivileged

type SitePermission = _SitePermission

type ThemeColor = String | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type ThemeManifestIcons = NumberDictionary[String]

type UndefinedChromeResources = StringDictionary[ExtensionURL | StringDictionary[ExtensionURL]]

type UnrecognizedProperty = Any

type WebExtensionDictionaryManifestDictionaries = StringDictionary[String]

type WebExtensionLangpackManifestLanguages = StringDictionary[Version]

type WebExtensionLangpackManifestSources = StringDictionary[Paths]

type WebExtensionManifestIcons = NumberDictionary[ExtensionFileUrl]
