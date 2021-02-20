package typings.wxJsSdkDt

import org.scalablytyped.runtime.StringDictionary
import typings.wxJsSdkDt.wx.Card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CardList extends StObject {
    
    var cardList: js.Array[Card] = js.native
  }
  object CardList {
    
    @scala.inline
    def apply(cardList: js.Array[Card]): CardList = {
      val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardList]
    }
    
    @scala.inline
    implicit class CardListMutableBuilder[Self <: CardList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardList(value: js.Array[Card]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardListVarargs(value: Card*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CheckResult extends StObject {
    
    var checkResult: StringDictionary[Boolean] = js.native
    
    var errMsg: Msg = js.native
  }
  object CheckResult {
    
    @scala.inline
    def apply(checkResult: StringDictionary[Boolean], errMsg: Msg): CheckResult = {
      val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResult]
    }
    
    @scala.inline
    implicit class CheckResultMutableBuilder[Self <: CheckResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckResult(value: StringDictionary[Boolean]): Self = StObject.set(x, "checkResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrMsg(value: Msg): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalData extends StObject {
    
    var localData: String = js.native
  }
  object LocalData {
    
    @scala.inline
    def apply(localData: String): LocalData = {
      val __obj = js.Dynamic.literal(localData = localData.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalData]
    }
    
    @scala.inline
    implicit class LocalDataMutableBuilder[Self <: LocalData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalData(value: String): Self = StObject.set(x, "localData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalId extends StObject {
    
    var localId: String = js.native
  }
  object LocalId {
    
    @scala.inline
    def apply(localId: String): LocalId = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalId]
    }
    
    @scala.inline
    implicit class LocalIdMutableBuilder[Self <: LocalId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalIds extends StObject {
    
    var localIds: js.Array[String] = js.native
  }
  object LocalIds {
    
    @scala.inline
    def apply(localIds: js.Array[String]): LocalIds = {
      val __obj = js.Dynamic.literal(localIds = localIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalIds]
    }
    
    @scala.inline
    implicit class LocalIdsMutableBuilder[Self <: LocalIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalIds(value: js.Array[String]): Self = StObject.set(x, "localIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalIdsVarargs(value: String*): Self = StObject.set(x, "localIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Msg extends StObject {
    
    var msg: String = js.native
  }
  object Msg {
    
    @scala.inline
    def apply(msg: String): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    @scala.inline
    implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkType extends StObject {
    
    var networkType: String = js.native
  }
  object NetworkType {
    
    @scala.inline
    def apply(networkType: String): NetworkType = {
      val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkType]
    }
    
    @scala.inline
    implicit class NetworkTypeMutableBuilder[Self <: NetworkType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultStr extends StObject {
    
    var resultStr: String = js.native
  }
  object ResultStr {
    
    @scala.inline
    def apply(resultStr: String): ResultStr = {
      val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultStr]
    }
    
    @scala.inline
    implicit class ResultStrMutableBuilder[Self <: ResultStr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultStr(value: String): Self = StObject.set(x, "resultStr", value.asInstanceOf[js.Any])
    }
  }
}
