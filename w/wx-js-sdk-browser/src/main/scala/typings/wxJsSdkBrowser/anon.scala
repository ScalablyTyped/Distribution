package typings.wxJsSdkBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.wxJsSdkBrowser.wx.Card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CardList extends StObject {
    
    var cardList: js.Array[Card]
  }
  object CardList {
    
    inline def apply(cardList: js.Array[Card]): CardList = {
      val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardList]
    }
    
    extension [Self <: CardList](x: Self) {
      
      inline def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
      
      inline def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value*))
    }
  }
  
  trait CheckResult extends StObject {
    
    var checkResult: StringDictionary[Boolean]
    
    var errMsg: Msg
  }
  object CheckResult {
    
    inline def apply(checkResult: StringDictionary[Boolean], errMsg: Msg): CheckResult = {
      val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResult]
    }
    
    extension [Self <: CheckResult](x: Self) {
      
      inline def setCheckResult(value: StringDictionary[Boolean]): Self = StObject.set(x, "checkResult", value.asInstanceOf[js.Any])
      
      inline def setErrMsg(value: Msg): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalData extends StObject {
    
    var localData: String
  }
  object LocalData {
    
    inline def apply(localData: String): LocalData = {
      val __obj = js.Dynamic.literal(localData = localData.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalData]
    }
    
    extension [Self <: LocalData](x: Self) {
      
      inline def setLocalData(value: String): Self = StObject.set(x, "localData", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalId extends StObject {
    
    var localId: String
  }
  object LocalId {
    
    inline def apply(localId: String): LocalId = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalId]
    }
    
    extension [Self <: LocalId](x: Self) {
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalIds extends StObject {
    
    var localIds: js.Array[String]
  }
  object LocalIds {
    
    inline def apply(localIds: js.Array[String]): LocalIds = {
      val __obj = js.Dynamic.literal(localIds = localIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalIds]
    }
    
    extension [Self <: LocalIds](x: Self) {
      
      inline def setLocalIds(value: js.Array[String]): Self = StObject.set(x, "localIds", value.asInstanceOf[js.Any])
      
      inline def setLocalIdsVarargs(value: String*): Self = StObject.set(x, "localIds", js.Array(value*))
    }
  }
  
  trait Msg extends StObject {
    
    var msg: String
  }
  object Msg {
    
    inline def apply(msg: String): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    extension [Self <: Msg](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkType extends StObject {
    
    var networkType: String
  }
  object NetworkType {
    
    inline def apply(networkType: String): NetworkType = {
      val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkType]
    }
    
    extension [Self <: NetworkType](x: Self) {
      
      inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultStr extends StObject {
    
    var resultStr: String
  }
  object ResultStr {
    
    inline def apply(resultStr: String): ResultStr = {
      val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultStr]
    }
    
    extension [Self <: ResultStr](x: Self) {
      
      inline def setResultStr(value: String): Self = StObject.set(x, "resultStr", value.asInstanceOf[js.Any])
    }
  }
}
