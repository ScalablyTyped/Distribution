package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.tuyaPanelKit.anon.Bic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevInfo[S] extends StObject {
  
  var ability: Double = js.native
  
  var activeTime: Double = js.native
  
  /**
    * @deprecated
    */
  var appId: Double = js.native
  
  var appKey: String = js.native
  
  /**
    * @desc 网络是否在线
    */
  var appOnline: Boolean = js.native
  
  var attribute: Double = js.native
  
  var baseAttribute: Double = js.native
  
  var bv: Double = js.native
  
  var capability: Double = js.native
  
  var category: String = js.native
  
  var categoryCode: String = js.native
  
  var cloudOnline: Boolean = js.native
  
  var codeIds: Record[String, String] = js.native
  
  var communication: Record[String, _] = js.native
  
  var devAttribute: Double = js.native
  
  var devId: String = js.native
  
  /**
    * @desc 设备是否在线
    */
  var deviceOnline: Boolean = js.native
  
  var deviceType: Double = js.native
  
  var displayDps: js.Array[_] = js.native
  
  var displayMsgs: Record[String, _] = js.native
  
  var displayOrder: Double = js.native
  
  var dpMaxTime: Double = js.native
  
  var dpName: Record[String | Double, String] = js.native
  
  var dps: Record[Double, String] = js.native
  
  var errorCode: Double = js.native
  
  var faultDps: js.Array[_] = js.native
  
  var gatewayVerCAD: String = js.native
  
  var gwType: String = js.native
  
  var homeDisplayOrder: Double = js.native
  
  var homeId: Double = js.native
  
  var i18nTime: Double = js.native
  
  var iconUrl: String = js.native
  
  var idCodes: Record[Double, String] = js.native
  
  var ip: String = js.native
  
  var isAdmin: Boolean = js.native
  
  var isCloudOnline: Boolean = js.native
  
  /**
    * @desc 局域网是否在线
    */
  var isLocalOnline: Boolean = js.native
  
  var isMeshBleOnline: Boolean = js.native
  
  var isNewFirmware: Boolean = js.native
  
  var isShare: Boolean = js.native
  
  var isUniversalPanel: Boolean = js.native
  
  var isVDevice: Boolean = js.native
  
  var latitude: String = js.native
  
  var localKey: String = js.native
  
  var longitude: String = js.native
  
  var lpv: Double = js.native
  
  var meshId: String = js.native
  
  var name: String = js.native
  
  var networkType: NetworkType = js.native
  
  var originJson: Record[String, _] = js.native
  
  var panelConfig: Bic = js.native
  
  var pcc: String = js.native
  
  var productId: String = js.native
  
  var protocolAttribute: Double = js.native
  
  var pv: Double = js.native
  
  var quickOpDps: js.Array[_] = js.native
  
  var rnFind: Boolean = js.native
  
  var roomId: Double = js.native
  
  var runtimeEnv: String = js.native
  
  var schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any] = js.native
  
  var schemaExt: String = js.native
  
  var sharedTime: Double = js.native
  
  var sigmeshId: String = js.native
  
  var standSchemaModel: Record[String, _] = js.native
  
  var standard: Boolean = js.native
  
  var state: S = js.native
  
  var supportGroup: Boolean = js.native
  
  var supportSGroup: Boolean = js.native
  
  var timezoneId: String = js.native
  
  var ui: String = js.native
  
  var uiId: String = js.native
  
  var uiPhase: String = js.native
  
  var uiType: String = js.native
  
  var uiVersion: String = js.native
  
  var upgrading: Boolean = js.native
  
  var uuid: String = js.native
  
  var vendorInfo: String = js.native
  
  var verSw: String = js.native
  
  var virtual: Boolean = js.native
}
object DevInfo {
  
  @scala.inline
  def apply[S](
    ability: Double,
    activeTime: Double,
    appId: Double,
    appKey: String,
    appOnline: Boolean,
    attribute: Double,
    baseAttribute: Double,
    bv: Double,
    capability: Double,
    category: String,
    categoryCode: String,
    cloudOnline: Boolean,
    codeIds: Record[String, String],
    communication: Record[String, _],
    devAttribute: Double,
    devId: String,
    deviceOnline: Boolean,
    deviceType: Double,
    displayDps: js.Array[_],
    displayMsgs: Record[String, _],
    displayOrder: Double,
    dpMaxTime: Double,
    dpName: Record[String | Double, String],
    dps: Record[Double, String],
    errorCode: Double,
    faultDps: js.Array[_],
    gatewayVerCAD: String,
    gwType: String,
    homeDisplayOrder: Double,
    homeId: Double,
    i18nTime: Double,
    iconUrl: String,
    idCodes: Record[Double, String],
    ip: String,
    isAdmin: Boolean,
    isCloudOnline: Boolean,
    isLocalOnline: Boolean,
    isMeshBleOnline: Boolean,
    isNewFirmware: Boolean,
    isShare: Boolean,
    isUniversalPanel: Boolean,
    isVDevice: Boolean,
    latitude: String,
    localKey: String,
    longitude: String,
    lpv: Double,
    meshId: String,
    name: String,
    networkType: NetworkType,
    originJson: Record[String, _],
    panelConfig: Bic,
    pcc: String,
    productId: String,
    protocolAttribute: Double,
    pv: Double,
    quickOpDps: js.Array[_],
    rnFind: Boolean,
    roomId: Double,
    runtimeEnv: String,
    schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any],
    schemaExt: String,
    sharedTime: Double,
    sigmeshId: String,
    standSchemaModel: Record[String, _],
    standard: Boolean,
    state: S,
    supportGroup: Boolean,
    supportSGroup: Boolean,
    timezoneId: String,
    ui: String,
    uiId: String,
    uiPhase: String,
    uiType: String,
    uiVersion: String,
    upgrading: Boolean,
    uuid: String,
    vendorInfo: String,
    verSw: String,
    virtual: Boolean
  ): DevInfo[S] = {
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], activeTime = activeTime.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appKey = appKey.asInstanceOf[js.Any], appOnline = appOnline.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], baseAttribute = baseAttribute.asInstanceOf[js.Any], bv = bv.asInstanceOf[js.Any], capability = capability.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], categoryCode = categoryCode.asInstanceOf[js.Any], cloudOnline = cloudOnline.asInstanceOf[js.Any], codeIds = codeIds.asInstanceOf[js.Any], communication = communication.asInstanceOf[js.Any], devAttribute = devAttribute.asInstanceOf[js.Any], devId = devId.asInstanceOf[js.Any], deviceOnline = deviceOnline.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayDps = displayDps.asInstanceOf[js.Any], displayMsgs = displayMsgs.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], dpMaxTime = dpMaxTime.asInstanceOf[js.Any], dpName = dpName.asInstanceOf[js.Any], dps = dps.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], faultDps = faultDps.asInstanceOf[js.Any], gatewayVerCAD = gatewayVerCAD.asInstanceOf[js.Any], gwType = gwType.asInstanceOf[js.Any], homeDisplayOrder = homeDisplayOrder.asInstanceOf[js.Any], homeId = homeId.asInstanceOf[js.Any], i18nTime = i18nTime.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], idCodes = idCodes.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], isCloudOnline = isCloudOnline.asInstanceOf[js.Any], isLocalOnline = isLocalOnline.asInstanceOf[js.Any], isMeshBleOnline = isMeshBleOnline.asInstanceOf[js.Any], isNewFirmware = isNewFirmware.asInstanceOf[js.Any], isShare = isShare.asInstanceOf[js.Any], isUniversalPanel = isUniversalPanel.asInstanceOf[js.Any], isVDevice = isVDevice.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], localKey = localKey.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], lpv = lpv.asInstanceOf[js.Any], meshId = meshId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any], originJson = originJson.asInstanceOf[js.Any], panelConfig = panelConfig.asInstanceOf[js.Any], pcc = pcc.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], protocolAttribute = protocolAttribute.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], quickOpDps = quickOpDps.asInstanceOf[js.Any], rnFind = rnFind.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any], runtimeEnv = runtimeEnv.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaExt = schemaExt.asInstanceOf[js.Any], sharedTime = sharedTime.asInstanceOf[js.Any], sigmeshId = sigmeshId.asInstanceOf[js.Any], standSchemaModel = standSchemaModel.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportGroup = supportGroup.asInstanceOf[js.Any], supportSGroup = supportSGroup.asInstanceOf[js.Any], timezoneId = timezoneId.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], uiId = uiId.asInstanceOf[js.Any], uiPhase = uiPhase.asInstanceOf[js.Any], uiType = uiType.asInstanceOf[js.Any], uiVersion = uiVersion.asInstanceOf[js.Any], upgrading = upgrading.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendorInfo = vendorInfo.asInstanceOf[js.Any], verSw = verSw.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevInfo[S]]
  }
  
  @scala.inline
  implicit class DevInfoMutableBuilder[Self <: DevInfo[_], S] (val x: Self with DevInfo[S]) extends AnyVal {
    
    @scala.inline
    def setAbility(value: Double): Self = StObject.set(x, "ability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTime(value: Double): Self = StObject.set(x, "activeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: Double): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppOnline(value: Boolean): Self = StObject.set(x, "appOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: Double): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseAttribute(value: Double): Self = StObject.set(x, "baseAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBv(value: Double): Self = StObject.set(x, "bv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapability(value: Double): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryCode(value: String): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnline(value: Boolean): Self = StObject.set(x, "cloudOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIds(value: Record[String, String]): Self = StObject.set(x, "codeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunication(value: Record[String, _]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevAttribute(value: Double): Self = StObject.set(x, "devAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevId(value: String): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOnline(value: Boolean): Self = StObject.set(x, "deviceOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: Double): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDps(value: js.Array[_]): Self = StObject.set(x, "displayDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDpsVarargs(value: js.Any*): Self = StObject.set(x, "displayDps", js.Array(value :_*))
    
    @scala.inline
    def setDisplayMsgs(value: Record[String, _]): Self = StObject.set(x, "displayMsgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpMaxTime(value: Double): Self = StObject.set(x, "dpMaxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpName(value: Record[String | Double, String]): Self = StObject.set(x, "dpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDps(value: Record[Double, String]): Self = StObject.set(x, "dps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultDps(value: js.Array[_]): Self = StObject.set(x, "faultDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultDpsVarargs(value: js.Any*): Self = StObject.set(x, "faultDps", js.Array(value :_*))
    
    @scala.inline
    def setGatewayVerCAD(value: String): Self = StObject.set(x, "gatewayVerCAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGwType(value: String): Self = StObject.set(x, "gwType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDisplayOrder(value: Double): Self = StObject.set(x, "homeDisplayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeId(value: Double): Self = StObject.set(x, "homeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nTime(value: Double): Self = StObject.set(x, "i18nTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCodes(value: Record[Double, String]): Self = StObject.set(x, "idCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdmin(value: Boolean): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloudOnline(value: Boolean): Self = StObject.set(x, "isCloudOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocalOnline(value: Boolean): Self = StObject.set(x, "isLocalOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeshBleOnline(value: Boolean): Self = StObject.set(x, "isMeshBleOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewFirmware(value: Boolean): Self = StObject.set(x, "isNewFirmware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShare(value: Boolean): Self = StObject.set(x, "isShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUniversalPanel(value: Boolean): Self = StObject.set(x, "isUniversalPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVDevice(value: Boolean): Self = StObject.set(x, "isVDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalKey(value: String): Self = StObject.set(x, "localKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLpv(value: Double): Self = StObject.set(x, "lpv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshId(value: String): Self = StObject.set(x, "meshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginJson(value: Record[String, _]): Self = StObject.set(x, "originJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelConfig(value: Bic): Self = StObject.set(x, "panelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcc(value: String): Self = StObject.set(x, "pcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolAttribute(value: Double): Self = StObject.set(x, "protocolAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPv(value: Double): Self = StObject.set(x, "pv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickOpDps(value: js.Array[_]): Self = StObject.set(x, "quickOpDps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickOpDpsVarargs(value: js.Any*): Self = StObject.set(x, "quickOpDps", js.Array(value :_*))
    
    @scala.inline
    def setRnFind(value: Boolean): Self = StObject.set(x, "rnFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomId(value: Double): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeEnv(value: String): Self = StObject.set(x, "runtimeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof S ]: tuya-panel-kit.tuya-panel-kit.DpSchema}
      */ typings.tuyaPanelKit.tuyaPanelKitStrings.DevInfo with TopLevel[js.Any]
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExt(value: String): Self = StObject.set(x, "schemaExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTime(value: Double): Self = StObject.set(x, "sharedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigmeshId(value: String): Self = StObject.set(x, "sigmeshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandSchemaModel(value: Record[String, _]): Self = StObject.set(x, "standSchemaModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportGroup(value: Boolean): Self = StObject.set(x, "supportGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportSGroup(value: Boolean): Self = StObject.set(x, "supportSGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneId(value: String): Self = StObject.set(x, "timezoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiId(value: String): Self = StObject.set(x, "uiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiPhase(value: String): Self = StObject.set(x, "uiPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiType(value: String): Self = StObject.set(x, "uiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiVersion(value: String): Self = StObject.set(x, "uiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgrading(value: Boolean): Self = StObject.set(x, "upgrading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorInfo(value: String): Self = StObject.set(x, "vendorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerSw(value: String): Self = StObject.set(x, "verSw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
  }
}
