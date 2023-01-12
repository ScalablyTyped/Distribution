package typings.yaml.anon

import typings.yaml.distLogMod.LogLevelId
import typings.yaml.distNodesNodeMod.ParsedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Omit<yaml.yaml/dist/options.ParseOptions & yaml.yaml/dist/options.DocumentOptions, '_directives' | 'lineCounter' | 'version'>> */
trait RequiredOmitParseOptionsD extends StObject {
  
  var intAsBigInt: Boolean
  
  var keepSourceTokens: Boolean
  
  var logLevel: LogLevelId
  
  var prettyErrors: Boolean
  
  var strict: Boolean
  
  var uniqueKeys: Boolean | (js.Function2[/* a */ ParsedNode, /* b */ ParsedNode, Boolean])
}
object RequiredOmitParseOptionsD {
  
  inline def apply(
    intAsBigInt: Boolean,
    keepSourceTokens: Boolean,
    logLevel: LogLevelId,
    prettyErrors: Boolean,
    strict: Boolean,
    uniqueKeys: Boolean | (js.Function2[/* a */ ParsedNode, /* b */ ParsedNode, Boolean])
  ): RequiredOmitParseOptionsD = {
    val __obj = js.Dynamic.literal(intAsBigInt = intAsBigInt.asInstanceOf[js.Any], keepSourceTokens = keepSourceTokens.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], prettyErrors = prettyErrors.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], uniqueKeys = uniqueKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOmitParseOptionsD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredOmitParseOptionsD] (val x: Self) extends AnyVal {
    
    inline def setIntAsBigInt(value: Boolean): Self = StObject.set(x, "intAsBigInt", value.asInstanceOf[js.Any])
    
    inline def setKeepSourceTokens(value: Boolean): Self = StObject.set(x, "keepSourceTokens", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevelId): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setPrettyErrors(value: Boolean): Self = StObject.set(x, "prettyErrors", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeys(value: Boolean | (js.Function2[/* a */ ParsedNode, /* b */ ParsedNode, Boolean])): Self = StObject.set(x, "uniqueKeys", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeysFunction2(value: (/* a */ ParsedNode, /* b */ ParsedNode) => Boolean): Self = StObject.set(x, "uniqueKeys", js.Any.fromFunction2(value))
  }
}
