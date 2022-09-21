package typings.strongGlobalize

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.strongGlobalize.anon.Headers
import typings.strongGlobalize.configMod.AnyObject
import typings.strongGlobalize.strongGlobalizeBooleans.`false`
import typings.strongGlobalize.strongGlobalizeStrings.all
import typings.strongGlobalize.strongGlobalizeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("strong-globalize/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strong-globalize/lib/helper", "AML_ALL")
  @js.native
  val AML_ALL: /* "all" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "AML_DEFAULT")
  @js.native
  val AML_DEFAULT: /* "none" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "AML_NONE")
  @js.native
  val AML_NONE: /* "none" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "BIG_NUM")
  @js.native
  val BIG_NUM: /* 999999999999.0 */ Double = js.native
  
  @JSImport("strong-globalize/lib/helper", "ENGLISH")
  @js.native
  val ENGLISH: /* "en" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "HELPTXT_TAG")
  @js.native
  val HELPTXT_TAG: /* "helptxt" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "MSG_GPB_UNAVAILABLE")
  @js.native
  val MSG_GPB_UNAVAILABLE: /* "*** Login to GPB failed or GPB.supportedTranslations error." */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "MSG_TAG")
  @js.native
  val MSG_TAG: /* "message" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "PSEUDO_LANG")
  @js.native
  val PSEUDO_LANG: /* "zz" */ String = js.native
  
  @JSImport("strong-globalize/lib/helper", "PSEUDO_TAG")
  @js.native
  val PSEUDO_TAG: /* "\\u265A\\u265B\\u265C\\u265D\\u265E\\u265F" */ String = js.native
  
  inline def alreadyScanned(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("alreadyScanned")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def cloneEnglishTxtSyncDeep(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneEnglishTxtSyncDeep")().asInstanceOf[Double]
  inline def cloneEnglishTxtSyncDeep(rootDir: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneEnglishTxtSyncDeep")(rootDir.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def directoryDepth(fullPath: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryDepth")(fullPath.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def enumerateFilesSync(
    rootDir: String,
    blackList: js.Array[String],
    targetFileType: String,
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSync")(rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSync(
    rootDir: String,
    blackList: js.Array[String],
    targetFileType: js.Array[String],
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSync")(rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSync(
    rootDir: String,
    blackList: Null,
    targetFileType: String,
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSync")(rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSync(
    rootDir: String,
    blackList: Null,
    targetFileType: js.Array[String],
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* filePath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSync")(rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enumerateFilesSyncPriv(
    currentPath: String,
    rootDir: String,
    blackList: js.Array[String],
    targetFileType: String,
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* child */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSyncPriv")(currentPath.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSyncPriv(
    currentPath: String,
    rootDir: String,
    blackList: js.Array[String],
    targetFileType: js.Array[String],
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* child */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSyncPriv")(currentPath.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSyncPriv(
    currentPath: String,
    rootDir: String,
    blackList: Null,
    targetFileType: String,
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* child */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSyncPriv")(currentPath.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enumerateFilesSyncPriv(
    currentPath: String,
    rootDir: String,
    blackList: Null,
    targetFileType: js.Array[String],
    verbose: Boolean,
    checkNodeModules: Boolean,
    callback: js.Function2[/* content */ String, /* child */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateFilesSyncPriv")(currentPath.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], blackList.asInstanceOf[js.Any], targetFileType.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enumerateLanguageSync(action: js.Function1[/* lang */ String, js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLanguageSync")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enumerateMsgSync(
    rootDir: String,
    lang: String,
    checkNodeModules: Boolean,
    callback: js.Function2[/* jsonObj */ AnyObject[Any], /* filePath */ String, Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateMsgSync")(rootDir.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def enumerateMsgSyncPriv(
    currentPath: String,
    rootDir: String,
    lang: String,
    checkNodeModules: Boolean,
    cloneEnglishTxt: Boolean,
    clonedTxtCount: Double,
    callback: js.Function2[/* json */ js.Object, /* file */ String, Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateMsgSyncPriv")(currentPath.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], checkNodeModules.asInstanceOf[js.Any], cloneEnglishTxt.asInstanceOf[js.Any], clonedTxtCount.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAppLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppLanguages")().asInstanceOf[js.Array[String]]
  
  inline def getLangAlias(lang: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLangAlias")(lang.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLanguageFromRequest(req: Headers, appLanguages: js.Array[String], defaultLanguage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageFromRequest")(req.asInstanceOf[js.Any], appLanguages.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPackageItem(root: String, itemName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageItem")(root.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPackageItem(root: Unit, itemName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageItem")(root.asInstanceOf[js.Any], itemName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getPackageName(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageName")().asInstanceOf[Any]
  inline def getPackageName(root: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageName")(root.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPackageVersion(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageVersion")().asInstanceOf[Any]
  inline def getPackageVersion(root: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageVersion")(root.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getRootDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootDir")().asInstanceOf[String]
  
  inline def getSupportedLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedLanguages")().asInstanceOf[js.Array[String]]
  
  inline def getTrailerAfterDot(name: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrailerAfterDot")(name.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def hashKeys(p: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hashKeys")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def headerIncluded(name: String, headersAllowed: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("headerIncluded")(name.asInstanceOf[js.Any], headersAllowed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def initGlobForSltGlobalize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initGlobForSltGlobalize")().asInstanceOf[Unit]
  inline def initGlobForSltGlobalize(rootDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initGlobForSltGlobalize")(rootDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initIntlDirs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("initIntlDirs")().asInstanceOf[Boolean]
  
  inline def intlDir(lang: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intlDir")(lang.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isLoadMessages(rootDir: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoadMessages")(rootDir.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRootPackage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRootPackage")().asInstanceOf[Boolean]
  
  inline def isSupportedLanguage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedLanguage")().asInstanceOf[Boolean]
  inline def isSupportedLanguage(lang: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadMsgFromFile(lang: String, rootDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMsgFromFile")(lang.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadMsgFromFile(lang: String, rootDir: String, enumerateNodeModules: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMsgFromFile")(lang.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], enumerateNodeModules.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mapArgs(p: String, args: js.Array[Any]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapArgs")(p.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def mapPercent(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPercent")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def maxDirectoryDepth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxDirectoryDepth")().asInstanceOf[Double]
  
  inline def msgFileIdHash(fileName: String, rootDir: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("msgFileIdHash")(fileName.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def myIntlDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("myIntlDir")().asInstanceOf[String]
  
  inline def normalizeKeyArrays(): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyArrays")().asInstanceOf[js.Array[js.Array[String]]]
  inline def normalizeKeyArrays(keyArrays: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyArrays")(keyArrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def normalizeKeyArrays(keyArrays: js.Array[String]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyArrays")(keyArrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def percent(msg: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readToJson(langDirPath: String, msgFile: String, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readToJson")(langDirPath.asInstanceOf[js.Any], msgFile.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def registerResTag(fileIdHash: String, fileName: String, lang: String, tagType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResTag")(fileIdHash.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], tagType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeDoubleCurlyBraces(json: AnyObject[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDoubleCurlyBraces")(json.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeObsoleteFile(dir: String, fileNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeObsoleteFile")(dir.asInstanceOf[js.Any], fileNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repackArgs(args: js.Array[Any], initIx: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("repackArgs")(args.asInstanceOf[js.Any], initIx.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def repackArgs(args: NumberDictionary[Any], initIx: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("repackArgs")(args.asInstanceOf[js.Any], initIx.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def replaceJson(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any]): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceJson")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  
  inline def requireResolve(depName: String, currentDir: String, rootDir: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("requireResolve")(depName.asInstanceOf[js.Any], currentDir.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resTagExists(fileIdHash: String, fileName: String, lang: String, tagType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resTagExists")(fileIdHash.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], tagType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def resolveDependencies(currentDir: String, rootDir: String): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDependencies")(currentDir.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  inline def resolveDependencies(currentDir: String, rootDir: String, moduleRootPaths: js.Array[String]): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDependencies")(currentDir.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], moduleRootPaths.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  inline def scanJson(keys: js.Array[String], data: AnyObject[Any]): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJson")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  inline def scanJson(keys: js.Array[String], data: AnyObject[Any], returnErrors: Boolean): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJson")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any], returnErrors.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  
  inline def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any]): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJsonPriv")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  inline def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any]): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJsonPriv")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  inline def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: js.Array[Any], returnErrors: Boolean): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJsonPriv")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any], returnErrors.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  inline def scanJsonPriv(keys: js.Array[String], data: AnyObject[Any], newValues: Null, returnErrors: Boolean): js.Array[String] | AnyObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanJsonPriv")(keys.asInstanceOf[js.Any], data.asInstanceOf[js.Any], newValues.asInstanceOf[js.Any], returnErrors.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | AnyObject[Any]]
  
  inline def setRootDir(rootPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootDir")(rootPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sortMsges(msgs: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortMsges")(msgs.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def stripBom(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripBom")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unsymbolLink(filePath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unsymbolLink")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def validateAmlValue(aml: String): `false` | js.Array[String] | all | none = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAmlValue")(aml.asInstanceOf[js.Any]).asInstanceOf[`false` | js.Array[String] | all | none]
  inline def validateAmlValue(aml: js.Array[String]): `false` | js.Array[String] | all | none = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAmlValue")(aml.asInstanceOf[js.Any]).asInstanceOf[`false` | js.Array[String] | all | none]
}
