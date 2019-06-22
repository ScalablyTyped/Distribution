organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-7efba4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-92c446",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1db2e3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-540bcc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-14d596",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-34082f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        