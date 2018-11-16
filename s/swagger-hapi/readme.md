```
// Type definitions for swagger-hapi 0.7
// Project: https://github.com/apigee-127/swagger-hapi#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/* =================== USAGE ===================

import * as SwaggerHapi from "swagger-hapi";
import * as Hapi from "hapi";

var app = new Hapi.Server();
let config: SwaggerHapi.Config = {
    appRoot: __dirname
};

SwaggerHapi.create(config, (err, middleware) => {
    if (err) {
        throw err; // or handle error
    }
    var port = process.env.PORT || 10010;
    app.connection({ port });

    app.register(middleware.plugin, function(err) {
        if (err) { return console.error("Failed to load plugin:", err); }
        app.start(function() {
            if (middleware.runner.swagger.paths['/hello']) {
                console.log('try this:\ncurl http://127.0.0.1:' + port + '/hello?name=Scott');
            }
        });
    });
});

 =============================================== */

```