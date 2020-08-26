package typings.webdriver

import typings.webdriver.WebDriver.FirefoxLogLevels
import typings.webdriver.WebDriver.LoggingPreferenceType
import typings.webdriver.WebDriver.PageLoadingStrategy
import typings.webdriver.WebDriver.ProxyTypes
import typings.webdriver.WebDriver.SameSiteOptions
import typings.webdriver.WebDriver.Timeouts
import typings.webdriver.WebDriver.WebDriverLogTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webdriverStrings {
  @js.native
  sealed trait ALL extends LoggingPreferenceType
  
  @js.native
  sealed trait CONFIG extends LoggingPreferenceType
  
  @js.native
  sealed trait FINE extends LoggingPreferenceType
  
  @js.native
  sealed trait FINER extends LoggingPreferenceType
  
  @js.native
  sealed trait FINEST extends LoggingPreferenceType
  
  @js.native
  sealed trait INFO extends LoggingPreferenceType
  
  @js.native
  sealed trait Lax extends SameSiteOptions
  
  @js.native
  sealed trait OFF extends LoggingPreferenceType
  
  @js.native
  sealed trait SEVERE extends LoggingPreferenceType
  
  @js.native
  sealed trait Strict extends SameSiteOptions
  
  @js.native
  sealed trait WARNING extends LoggingPreferenceType
  
  @js.native
  sealed trait autodetect extends ProxyTypes
  
  @js.native
  sealed trait config_ extends FirefoxLogLevels
  
  @js.native
  sealed trait debug
    extends FirefoxLogLevels
       with WebDriverLogTypes
  
  @js.native
  sealed trait eager extends PageLoadingStrategy
  
  @js.native
  sealed trait error
    extends FirefoxLogLevels
       with WebDriverLogTypes
  
  @js.native
  sealed trait fatal extends FirefoxLogLevels
  
  @js.native
  sealed trait `implicit` extends Timeouts
  
  @js.native
  sealed trait info_
    extends FirefoxLogLevels
       with WebDriverLogTypes
  
  @js.native
  sealed trait manual extends ProxyTypes
  
  @js.native
  sealed trait none extends PageLoadingStrategy
  
  @js.native
  sealed trait noproxy extends ProxyTypes
  
  @js.native
  sealed trait normal extends PageLoadingStrategy
  
  @js.native
  sealed trait pac extends ProxyTypes
  
  @js.native
  sealed trait pageLoad extends Timeouts
  
  @js.native
  sealed trait script extends Timeouts
  
  @js.native
  sealed trait silent extends WebDriverLogTypes
  
  @js.native
  sealed trait system extends ProxyTypes
  
  @js.native
  sealed trait trace
    extends FirefoxLogLevels
       with WebDriverLogTypes
  
  @js.native
  sealed trait warn
    extends FirefoxLogLevels
       with WebDriverLogTypes
  
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def CONFIG: CONFIG = "CONFIG".asInstanceOf[CONFIG]
  @scala.inline
  def FINE: FINE = "FINE".asInstanceOf[FINE]
  @scala.inline
  def FINER: FINER = "FINER".asInstanceOf[FINER]
  @scala.inline
  def FINEST: FINEST = "FINEST".asInstanceOf[FINEST]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  @scala.inline
  def OFF: OFF = "OFF".asInstanceOf[OFF]
  @scala.inline
  def SEVERE: SEVERE = "SEVERE".asInstanceOf[SEVERE]
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  @scala.inline
  def autodetect: autodetect = "autodetect".asInstanceOf[autodetect]
  @scala.inline
  def config_ : config_ = "config".asInstanceOf[config_]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def eager: eager = "eager".asInstanceOf[eager]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  @scala.inline
  def info_ : info_ = "info".asInstanceOf[info_]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def noproxy: noproxy = "noproxy".asInstanceOf[noproxy]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def pac: pac = "pac".asInstanceOf[pac]
  @scala.inline
  def pageLoad: pageLoad = "pageLoad".asInstanceOf[pageLoad]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

