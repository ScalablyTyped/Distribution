package typings.strongGlobalize

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.strongGlobalize.libConfigMod.AnyObject
import typings.strongGlobalize.libConfigMod.GlobalizeConfig
import typings.strongGlobalize.strongGlobalizeBooleans.`false`
import typings.strongGlobalize.strongGlobalizeStrings.all
import typings.strongGlobalize.strongGlobalizeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    var headers: StringDictionary[String]
  }
  object Headers {
    
    inline def apply(headers: StringDictionary[String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeadersAnyObject extends StObject {
    
    var headers: AnyObject[Any]
  }
  object HeadersAnyObject {
    
    inline def apply(headers: AnyObject[Any]): HeadersAnyObject = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadersAnyObject]
    }
    
    extension [Self <: HeadersAnyObject](x: Self) {
      
      inline def setHeaders(value: AnyObject[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofglobalize extends StObject {
    
    val STRONGLOOP_GLB: GlobalizeConfig = js.native
    
    def alert(args: Any*): Any = js.native
    
    def consoleEnabled(): Boolean = js.native
    
    def critical(args: Any*): Any = js.native
    
    def data(args: Any*): Any = js.native
    
    def debug(args: Any*): Any = js.native
    
    def emergency(args: Any*): Any = js.native
    
    def error(args: Any*): Any = js.native
    
    def formatCurrency(value: Any, currencySymbol: String): Any = js.native
    def formatCurrency(value: Any, currencySymbol: String, options: Unit, lang: String): Any = js.native
    def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any]): Any = js.native
    def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any], lang: String): Any = js.native
    
    def formatDate(value: js.Date): Any = js.native
    def formatDate(value: js.Date, options: Unit, lang: String): Any = js.native
    def formatDate(value: js.Date, options: AnyObject[Any]): Any = js.native
    def formatDate(value: js.Date, options: AnyObject[Any], lang: String): Any = js.native
    
    def formatJson(fullPath: String, variables: js.Array[String]): Any = js.native
    def formatJson(fullPath: String, variables: js.Array[String], lang: String): Any = js.native
    
    def formatMessage(path: String): Any = js.native
    def formatMessage(path: String, variables: String): Any = js.native
    def formatMessage(path: String, variables: String, lang: String): Any = js.native
    def formatMessage(path: String, variables: js.Array[String]): Any = js.native
    def formatMessage(path: String, variables: js.Array[String], lang: String): Any = js.native
    def formatMessage(path: String, variables: Unit, lang: String): Any = js.native
    
    def formatNumber(value: Double): Any = js.native
    def formatNumber(value: Double, options: Unit, lang: String): Any = js.native
    def formatNumber(value: Double, options: AnyObject[Any]): Any = js.native
    def formatNumber(value: Double, options: AnyObject[Any], lang: String): Any = js.native
    
    def help(args: Any*): Any = js.native
    
    def info(args: Any*): Any = js.native
    
    def informational(args: Any*): Any = js.native
    
    def input(args: Any*): Any = js.native
    
    def loadGlobalize(): Any = js.native
    def loadGlobalize(lang: String): Any = js.native
    def loadGlobalize(lang: String, enumerateNodeModules: Boolean): Any = js.native
    def loadGlobalize(lang: Unit, enumerateNodeModules: Boolean): Any = js.native
    
    def log(args: Any*): Any = js.native
    
    def logPersistent(level: String, message: Any): Unit = js.native
    def logPersistent(level: Unit, message: Any): Unit = js.native
    
    def notice(args: Any*): Any = js.native
    
    def packMessage(args: js.Array[Any], fn: js.Function1[/* msg */ Any, Any], withOriginalMsg: Boolean): Any = js.native
    def packMessage(args: js.Array[Any], fn: js.Function1[/* msg */ Any, Any], withOriginalMsg: Boolean, lang: String): Any = js.native
    def packMessage(args: js.Array[Any], fn: Null, withOriginalMsg: Boolean): Any = js.native
    def packMessage(args: js.Array[Any], fn: Null, withOriginalMsg: Boolean, lang: String): Any = js.native
    
    def prompt(args: Any*): Any = js.native
    
    def rfc5424(level: String, args: js.Array[Any], print: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    def rfc5424(level: String, args: js.Array[Any], print: js.Function1[/* repeated */ Any, Unit], lang: String): Any = js.native
    
    def setAppLanguages(): js.Array[String] = js.native
    def setAppLanguages(langs: js.Array[String]): js.Array[String] = js.native
    
    def setDefaultLanguage(): js.UndefOr[String] = js.native
    def setDefaultLanguage(lang: String): js.UndefOr[String] = js.native
    
    def setPersistentLogging(logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit]): Unit = js.native
    def setPersistentLogging(
      logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit],
      disableConsole: Boolean
    ): Unit = js.native
    
    def setRootDir(rootPath: String): Unit = js.native
    
    def silly(args: Any*): Any = js.native
    
    def verbose(args: Any*): Any = js.native
    
    def warn(args: Any*): Any = js.native
    
    def warning(args: Any*): Any = js.native
  }
  
  @js.native
  trait Typeofhelper extends StObject {
    
    val AML_ALL: /* "all" */ String = js.native
    
    val AML_DEFAULT: /* "none" */ String = js.native
    
    val AML_NONE: /* "none" */ String = js.native
    
    val BIG_NUM: /* 999999999999.0 */ Double = js.native
    
    val ENGLISH: /* "en" */ String = js.native
    
    val HELPTXT_TAG: /* "helptxt" */ String = js.native
    
    val MSG_GPB_UNAVAILABLE: /* "*** Login to GPB failed or GPB.supportedTranslations error." */ String = js.native
    
    val MSG_TAG: /* "message" */ String = js.native
    
    val PSEUDO_LANG: /* "zz" */ String = js.native
    
    val PSEUDO_TAG: /* "\\u265A\\u265B\\u265C\\u265D\\u265E\\u265F" */ String = js.native
    
    def alreadyScanned(fileName: String): Boolean = js.native
    
    def cloneEnglishTxtSyncDeep(): Double = js.native
    def cloneEnglishTxtSyncDeep(rootDir: String): Double = js.native
    
    def directoryDepth(fullPath: String): Double = js.native
    
    def enumerateFilesSync(
      rootDir: String,
      blackList: js.Array[String],
      targetFileType: String,
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSync(
      rootDir: String,
      blackList: js.Array[String],
      targetFileType: js.Array[String],
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSync(
      rootDir: String,
      blackList: Null,
      targetFileType: String,
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSync(
      rootDir: String,
      blackList: Null,
      targetFileType: js.Array[String],
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
    ): Unit = js.native
    
    def enumerateFilesSyncPriv(
      currentPath: String,
      rootDir: String,
      blackList: js.Array[String],
      targetFileType: String,
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* child */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSyncPriv(
      currentPath: String,
      rootDir: String,
      blackList: js.Array[String],
      targetFileType: js.Array[String],
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* child */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSyncPriv(
      currentPath: String,
      rootDir: String,
      blackList: Null,
      targetFileType: String,
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* child */ String, Unit]
    ): Unit = js.native
    def enumerateFilesSyncPriv(
      currentPath: String,
      rootDir: String,
      blackList: Null,
      targetFileType: js.Array[String],
      verbose: Boolean,
      checkNodeModules: Boolean,
      callback: js.Function2[/* content */ String, /* child */ String, Unit]
    ): Unit = js.native
    
    def enumerateLanguageSync(action: js.Function1[/* lang */ String, js.UndefOr[Boolean]]): Unit = js.native
    
    def enumerateMsgSync(
      rootDir: String,
      lang: String,
      checkNodeModules: Boolean,
      callback: js.Function2[/* jsonObj */ AnyObject[Any], /* filePath */ String, Unit]
    ): Double = js.native
    
    def enumerateMsgSyncPriv(
      currentPath: String,
      rootDir: String,
      lang: String,
      checkNodeModules: Boolean,
      cloneEnglishTxt: Boolean,
      clonedTxtCount: Double,
      callback: js.Function2[/* json */ js.Object, /* file */ String, Unit]
    ): Double = js.native
    
    def getAppLanguages(): js.Array[String] = js.native
    
    def getLangAlias(lang: String): String = js.native
    
    def getLanguageFromRequest(req: Headers, appLanguages: js.Array[String], defaultLanguage: String): String = js.native
    
    def getPackageItem(root: String, itemName: String): Any = js.native
    def getPackageItem(root: Unit, itemName: String): Any = js.native
    
    def getPackageName(): Any = js.native
    def getPackageName(root: String): Any = js.native
    
    def getPackageVersion(): Any = js.native
    def getPackageVersion(root: String): Any = js.native
    
    def getRootDir(): String = js.native
    
    def getSupportedLanguages(): js.Array[String] = js.native
    
    def getTrailerAfterDot(name: String): String | Null = js.native
    
    def hashKeys(p: String): Boolean = js.native
    
    def headerIncluded(name: String, headersAllowed: js.Array[String]): Boolean = js.native
    
    def initGlobForSltGlobalize(): Unit = js.native
    def initGlobForSltGlobalize(rootDir: String): Unit = js.native
    
    def initIntlDirs(): Boolean = js.native
    
    def intlDir(lang: String): String = js.native
    
    def isLoadMessages(rootDir: String): Boolean = js.native
    
    def isRootPackage(): Boolean = js.native
    
    def isSupportedLanguage(): Boolean = js.native
    def isSupportedLanguage(lang: String): Boolean = js.native
    
    def loadMsgFromFile(lang: String, rootDir: String): Unit = js.native
    def loadMsgFromFile(lang: String, rootDir: String, enumerateNodeModules: Boolean): Unit = js.native
    
    def mapArgs(p: String, args: js.Array[Any]): js.Array[String] = js.native
    
    def mapPercent(msg: String): String = js.native
    
    def maxDirectoryDepth(): Double = js.native
    
    def msgFileIdHash(fileName: String, rootDir: String): String = js.native
    
    def myIntlDir(): String = js.native
    
    def normalizeKeyArrays(): js.Array[js.Array[String]] = js.native
    def normalizeKeyArrays(keyArrays: String): js.Array[js.Array[String]] = js.native
    def normalizeKeyArrays(keyArrays: js.Array[String]): js.Array[js.Array[String]] = js.native
    
    def percent(msg: String): Boolean = js.native
    
    def readToJson(langDirPath: String, msgFile: String, lang: String): Any = js.native
    
    def registerResTag(fileIdHash: String, fileName: String, lang: String, tagType: String): Boolean = js.native
    
    def removeDoubleCurlyBraces(json: AnyObject[Any]): Unit = js.native
    
    def removeObsoleteFile(dir: String, fileNames: js.Array[String]): Unit = js.native
    
    def repackArgs(args: js.Array[Any], initIx: Double): js.Array[Any] = js.native
    def repackArgs(args: NumberDictionary[Any], initIx: Double): js.Array[Any] = js.native
    
    def replaceJson(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any]): js.Array[String] | AnyObject[Any] = js.native
    
    def requireResolve(depName: String, currentDir: String, rootDir: String): String | Null = js.native
    
    def resTagExists(fileIdHash: String, fileName: String, lang: String, tagType: String): Boolean = js.native
    
    def resolveDependencies(currentDir: String, rootDir: String): js.Array[String] | Null = js.native
    def resolveDependencies(currentDir: String, rootDir: String, moduleRootPaths: js.Array[String]): js.Array[String] | Null = js.native
    
    def scanJson(keys: js.Array[String], data: AnyObject[Any]): js.Array[String] | AnyObject[Any] = js.native
    def scanJson(keys: js.Array[String], data: AnyObject[Any], returnErrors: Boolean): js.Array[String] | AnyObject[Any] = js.native
    
    def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any]): js.Array[String] | AnyObject[Any] = js.native
    def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any]): js.Array[String] | AnyObject[Any] = js.native
    def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any], returnErrors: Boolean): js.Array[String] | AnyObject[Any] = js.native
    def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: Null, returnErrors: Boolean): js.Array[String] | AnyObject[Any] = js.native
    
    def setRootDir(rootPath: String): Unit = js.native
    
    def sortMsges(msgs: StringDictionary[Any]): StringDictionary[Any] = js.native
    
    def stripBom(str: String): String = js.native
    
    def unsymbolLink(filePath: String): String | Null = js.native
    
    def validateAmlValue(aml: String): `false` | js.Array[String] | all | none = js.native
    def validateAmlValue(aml: js.Array[String]): `false` | js.Array[String] | all | none = js.native
  }
}
